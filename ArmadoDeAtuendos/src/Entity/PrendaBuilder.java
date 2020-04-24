package Entity;

import Domain.ColoresPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Entity.Prenda;
import Exception.PrendaInvalidaException;

public class PrendaBuilder {


    TipoPrenda tipoPrenda;
    Enum<MaterialPrenda> materialPrenda;
    ColoresPrenda coloresPrenda;
    PrendaBuilder(TipoPrenda tipoPrenda){
        this.tipoPrenda = tipoPrenda;
    }

    public TipoPrenda getTipoPrenda() {
        return tipoPrenda;
    }

    public Enum<MaterialPrenda> getMaterialPrenda() {
        return materialPrenda;
    }

    public ColoresPrenda getColoresPrenda() {
        return coloresPrenda;
    }

    public void setMaterialPrenda(Enum<MaterialPrenda> materialPrenda) {
        this.materialPrenda = materialPrenda;
    }

    public void setColoresPrenda(ColoresPrenda coloresPrenda) {
        this.coloresPrenda = coloresPrenda;
    }
    public Prenda crearPrenda()throws Exception {
        Prenda nuevaPrenda;
        try {
            nuevaPrenda = new Prenda(this.getTipoPrenda(), (MaterialPrenda) this.getMaterialPrenda(), this.getColoresPrenda());
            return nuevaPrenda;
        }catch (PrendaInvalidaException prendaInvalidaException){
            throw prendaInvalidaException;
        }
    }
}
