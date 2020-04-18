package Entity;

import Domain.CategoriaPrenda;
import Domain.MaterialPrenda;
import Domain.TipoPrenda;
import Exception.PrendaInvalidaException;

import java.awt.*;

public class Prenda {
    Enum<TipoPrenda> tipoPrenda;
    Enum<CategoriaPrenda> categoriaPrenda;
    Enum<MaterialPrenda> materialPrenda;
    Color colorPrincipal; //Clase color que tiene tres atributos R, G y B
    Color colorSecundario; //opcional

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, MaterialPrenda materialPrenda, Color colorPrincipal, Color colorSecundario) throws Exception {

        if (!this.prendaEsValida(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, String materialPrenda, String colorPrincipal, String colorSecundario)) {
            throw new Exception("Prenda inválida");
        }
        this.tipoPrenda = tipoPrenda;
        this.categoriaPrenda = categoriaPrenda;
        this.materialPrenda = materialPrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, String materialPrenda, String colorPrincipal, String colorSecundario) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (categoriaPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Categoria De Prenda");
        }
        if (categoriaPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Categoria De Prenda");
        }
        return true;
    }



}
