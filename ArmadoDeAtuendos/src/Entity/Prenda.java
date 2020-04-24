package Entity;

import Domain.ColoresPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Exception.PrendaInvalidaException;

public class Prenda {
    TipoPrenda tipoPrenda;
    Enum<MaterialPrenda> materialPrenda;
    ColoresPrenda coloresPrenda;

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda) throws Exception {

        try{
            if (this.prendaEsValida(tipoPrenda, materialPrenda, coloresPrenda)) {
                this.tipoPrenda = tipoPrenda;
                this.materialPrenda = materialPrenda;
                this.coloresPrenda= coloresPrenda;
            }

        }catch (PrendaInvalidaException e){
            throw e;
        }
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (materialPrenda == null || !tipoPrenda.materialEsConsistente(materialPrenda)){
            throw new PrendaInvalidaException("material de prenda inválido");
        }
        if (!coloresPrenda.coloresSonValidos() || !tipoPrenda.coloresSonConsistentes(coloresPrenda)){
            throw new PrendaInvalidaException("Falta ingresar color principal de prenda");
        }
        return true;
    }



}
