public class Color {
    //La clase no tiene comportamiento pero es una buena abstraccion
    int rojo;
    int azul;
    int verde;
    Color(int rojo, int azul, int verde) throws Exception{
        if (!colorEsValido(rojo, azul, verde)){
            throw new Exception("Color invalido");
        }else{
            this.rojo = rojo;
            this.azul = azul;
            this.verde = verde;
        }
    }
    boolean colorEsValido(int rojo,int azul,int verde ){
        return dentroDelRangoDeColores(rojo) && dentroDelRangoDeColores(azul) && dentroDelRangoDeColores(verde);

    }
    boolean dentroDelRangoDeColores(int color){
        return color >= 0 && color <=255;
    }
}
