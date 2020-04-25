package Entity;

import Domain.ColoresPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Domain.TramaPrenda;
import Exception.PrendaInvalidaException;

public class PrendaBuilder {


    TipoPrenda tipoPrenda;
    MaterialPrenda materialPrenda;
    ColoresPrenda coloresPrenda;
    TramaPrenda tramaPrenda;


    //Como usuarie de QuéMePongo, quiero crear una prenda especificando primero de qué tipo es.
    //--> Al crear una prenda con el builder si o si especifico el tipo
    PrendaBuilder(TipoPrenda tipoPrenda){
        this.tipoPrenda = tipoPrenda;
    }

    public Prenda crearPrenda()throws Exception {
        Prenda nuevaPrenda;
        try {
            nuevaPrenda = new Prenda(this.getTipoPrenda(),this.getMaterialPrenda(), this.getColoresPrenda(), this.getTramaPrenda());
            return nuevaPrenda;
        }catch (PrendaInvalidaException prendaInvalidaException){
            throw prendaInvalidaException;
        }
    }

    // -- ACCESSORS -- //


    //Como usuarie de QuéMePongo, quiero poder no indicar ninguna trama para una tela, y que por defecto ésta sea lisa
    public TramaPrenda getTramaPrenda() {
        if (this.tramaPrenda == null){
            return TramaPrenda.LISA;
        }else{
            return tramaPrenda;
        }
    }

    //Como usuarie de QuéMePongo, quiero crear una prenda especificando en segundo lugar los aspectos relacionados a su material
    // (colores, material, trama, etc) para evitar elegir materiales inconsistentes con el tipo de prenda

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    //se tiene que poder modificar el tipo de prenda durante la creación? Cómo afecta eso a las validaciones?
    //Si dejo que se pueda modificar la validacion la haría fuera de los setters, sino puedo validar cuando settee los aspectos
    //relacionados a su material

    /*public void setTipoPrenda(TipoPrenda tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }*/

    public MaterialPrenda getMaterialPrenda() {
        return materialPrenda;
    }

    public ColoresPrenda getColoresPrenda() {
        return coloresPrenda;
    }

    public void setTramaPrenda(TramaPrenda tramaPrenda) throws Exception {
        this.tramaPrenda = tramaPrenda;
    }

    public void setMaterialPrenda(MaterialPrenda materialPrenda) throws Exception {
        if (this.getTipoPrenda().materialEsConsistente(materialPrenda)){
            this.materialPrenda = materialPrenda;
        }else {
            throw new PrendaInvalidaException("Material no es consistente");

        }
    }
    public void setColoresPrenda(ColoresPrenda coloresPrenda) throws Exception {
        this.coloresPrenda = coloresPrenda;
    }


}
