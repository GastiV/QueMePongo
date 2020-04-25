package Entity;

import Domain.ColoresPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Domain.TramaPrenda;
import Exception.PrendaInvalidaException;

public class Prenda {
    TipoPrenda tipoPrenda;
    MaterialPrenda materialPrenda;
    ColoresPrenda coloresPrenda;

    //Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).
    TramaPrenda tramaPrenda;

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda, TramaPrenda tramaPrenda) throws Exception {

        try{
            if (this.prendaEsValida(tipoPrenda, materialPrenda, coloresPrenda, tramaPrenda)) {
                this.tipoPrenda = tipoPrenda;
                this.materialPrenda = materialPrenda;
                this.coloresPrenda= coloresPrenda;
                this.tramaPrenda = tramaPrenda;
            }

        }catch (PrendaInvalidaException e){
            throw e;
        }
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda,TramaPrenda tramaPrenda) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (materialPrenda == null || !tipoPrenda.materialEsConsistente(materialPrenda)){
            throw new PrendaInvalidaException("material de prenda inválido");
        }
        return true;
    }



}
