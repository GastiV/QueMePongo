package Entity;

public class Atuendo {
    Prenda PARTE_SUPERIOR;
    Prenda PARTE_INFERIOR;
    Prenda CALZADO;
    Prenda ACCESORIOS;

    public Atuendo(Prenda PARTE_SUPERIOR, Prenda PARTE_INFERIOR, Prenda CALZADO, Prenda ACCESORIOS) {
        this.PARTE_SUPERIOR = PARTE_SUPERIOR;
        this.PARTE_INFERIOR = PARTE_INFERIOR;
        this.CALZADO = CALZADO;
        this.ACCESORIOS = ACCESORIOS;
    }
}
