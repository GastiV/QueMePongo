package Domain;

import java.awt.*;

public class ColoresPrenda {

    Color colorPrincipal; //Clase color que tiene tres atributos R, G y B
    Color colorSecundario; //opcional


    ColoresPrenda(Color colorPrincipal, Color colorSecundario){
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }
    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }
    public boolean coloresSonValidos(){
        return this.getColorPrincipal() != null;
    }
}
