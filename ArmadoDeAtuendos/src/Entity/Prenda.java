package Entity;

import Domain.CategoriaPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Exception.PrendaInvalidaException;

import java.awt.*;

public class Prenda {
    TipoPrenda tipoPrenda;
    Enum<MaterialPrenda> materialPrenda;
    Color colorPrincipal; //Clase color que tiene tres atributos R, G y B
    Color colorSecundario; //opcional

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, Color colorPrincipal, Color colorSecundario) throws Exception {

        if (!this.prendaEsValida(tipoPrenda, materialPrenda, colorPrincipal, colorSecundario)) {
            throw new Exception("Prenda inválida");
        }
        this.tipoPrenda = tipoPrenda;
        this.materialPrenda = materialPrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, MaterialPrenda materialPrenda, Color colorPrincipal, Color colorSecundario) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (materialPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar material de prenda");
        }
        if (colorPrincipal == null){
            throw new PrendaInvalidaException("Falta ingresar color principal de prenda");
        }
        return true;
    }



}
