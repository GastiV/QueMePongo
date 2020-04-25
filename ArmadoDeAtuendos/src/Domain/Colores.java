package Domain;

import java.awt.*;

public class Colores {

    Color colorPrincipal; //Clase color que tiene tres atributos R, G y B
    Color colorSecundario; //opcional


    Colores(Color colorPrincipal, Color colorSecundario){
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
