package Entity;

import Domain.CategoriaPrenda;
import Domain.ColoresPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Exception.PrendaInvalidaException;

import java.awt.*;

public class Prenda {
    TipoPrenda tipoPrenda;
    Enum<MaterialPrenda> materialPrenda;
    ColoresPrenda coloresPrenda;

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda) throws Exception {

        if (!this.prendaEsValida(tipoPrenda, materialPrenda, coloresPrenda)) {
            throw new Exception("Prenda inválida");
        }
        this.tipoPrenda = tipoPrenda;
        this.materialPrenda = materialPrenda;
        this.coloresPrenda= coloresPrenda;
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, ColoresPrenda coloresPrenda) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (materialPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar material de prenda");
        }
        if (!coloresPrenda.coloresSonValidos()){
            throw new PrendaInvalidaException("Falta ingresar color principal de prenda");
        }
        return true;
    }



}
