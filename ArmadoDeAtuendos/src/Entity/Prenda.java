package Entity;

public class Prenda {
    Enum<TipoPrenda> tipoPrenda;
    Enum<CategoriaPrenda> categoriaPrenda;
    Enum<MaterialPrenda> materialPrenda;
    Color colorPrincipal; //Clase color que tiene tres atributos R, G y B
    Color colorSecundario; //opcional

    public Prenda(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, MaterialPrenda materialPrenda, Color colorPrincipal, Color colorSecundario) throws Exception {

        if (!this.prendaEsValida(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, String materialPrenda, String colorPrincipal, String colorSecundario)) {
            throw new Exception("Entity.Prenda inválida");
        }
        this.tipoPrenda = tipoPrenda;
        this.categoriaPrenda = categoriaPrenda;
        this.materialPrenda = materialPrenda;
        this.colorPrincipal = colorPrincipal;
        this.colorSecundario = colorSecundario;
    }

    private boolean prendaEsValida(TipoPrenda tipoPrenda, CategoriaPrenda categoriaPrenda, String materialPrenda, String colorPrincipal, String colorSecundario){
        return true;
    }



}