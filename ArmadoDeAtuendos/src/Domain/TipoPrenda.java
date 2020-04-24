package Domain;
public class TipoPrenda{
    CategoriaPrenda categoriaPrenda;
    TipoPrenda(CategoriaPrenda categoriaPrenda){
        this.categoriaPrenda = categoriaPrenda;
    }
    public CategoriaPrenda categoriaPrenda(){
        return this.categoriaPrenda;
    }
    final TipoPrenda ZAPATO = new TipoPrenda(CategoriaPrenda.CALZADO);
    final TipoPrenda PARTE_SUPERIOR = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR);
    final TipoPrenda PARTE_INFERIOR = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR);
}
// En algún lugar del código (por ejemplo, en la misma clase TipoDePrenda)
// deberemos establecer la relación entre ambas:


