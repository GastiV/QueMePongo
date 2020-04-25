package Domain;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import Domain.CategoriaPrenda;

//TODO por alguna razón me pedía el ; acá
public enum TipoPrenda{;

    private final java.util.List<MaterialPrenda> materialesAdecuados;
    CategoriaPrenda categoriaPrenda;

    TipoPrenda(CategoriaPrenda categoriaPrenda, List<MaterialPrenda> materialesAdecuados){
        this.materialesAdecuados = materialesAdecuados;
    }

    public boolean admiteMaterial(MaterialPrenda material){
        return getMaterialesAdecuados().contains(material);
    }

    private List<MaterialPrenda> getMaterialesAdecuados() {
        return this.materialesAdecuados;
    }

    public CategoriaPrenda categoriaPrenda(){
        return this.categoriaPrenda;
    }
    public boolean materialEsConsistente(MaterialPrenda materialPrenda){
        return true;
    }

    /*final TipoPrenda ZAPATO = new TipoPrenda(CategoriaPrenda.CALZADO, Arrays.asList(MaterialPrenda.CUERO,MaterialPrenda.ALGODON));
    final TipoPrenda PARTE_SUPERIOR = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR, null, null, null);
    final TipoPrenda PARTE_INFERIOR = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR,null, null, null);*/
}

/*public enum ZAPATO extends TipoPrenda{

    List<MaterialPrenda> getMaterialesAdecuados(){
        materialesAdecuados.clear();
        materialesAdecuados.add(Matrial.ALGODON);
        return materialesAdecuados;a
    }
    boolean coindiceCategoria(){
        return categoria == Categoria.PARTESUPERIOR;
    }
}*/

/*
class Camisa extends Tipo{
    List<Material> getMaterialesAdecuados(){
        materialesAdecuados.clear();
        materialesAdecuados.add(Matrial.ALGODON);
        return materialesAdecuados;a
    }
    boolean coindiceCategoria(){
        return categoria == Categoria.PARTESUPERIOR;
    }
}
...

//--------------------------------

public enum TipoPrenda{
    List<Material> materialesAdecuados;

    private Tipo(List<Material> materialesAdecuados){
        this.materialesAdecuados = materialesAdecuados;
    }

    public boolean admiteMaterial(Material material){
        return getMaterialesAdecuados().includes(material)
    }

    ZAPATO(Arrays.asList(Material.CUERO,MATERIAL.Algodon)),
    REMERA(Arrays.asList(Material.POLIESTER,MATERIAL.Algodon,...))
    }*/