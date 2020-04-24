package Domain;

import java.awt.*;
import java.util.List;

public class TipoPrenda{
    CategoriaPrenda categoriaPrenda;
    List<MaterialPrenda> MaterialesConsistentes;
    List<TramaPrenda> TramasConsistentes;
    List<Color> coloresConsistentes;

    TipoPrenda(CategoriaPrenda categoriaPrenda, List<MaterialPrenda> materialesConsistentes, List<TramaPrenda> tramasConsistentes, List<Color> coloresConsistentes){
        this.categoriaPrenda = categoriaPrenda;
        this.MaterialesConsistentes = materialesConsistentes;
        this.TramasConsistentes = tramasConsistentes;
        this.coloresConsistentes = coloresConsistentes;
    }
    public CategoriaPrenda categoriaPrenda(){
        return this.categoriaPrenda;
    }

    //validar que elemento corresponda con el tipo de la lista
    public void agregarElementoALista(List<Enum> lista, Enum elemento){
        //lista.add(elemento)
    }
    public void eliminarElementoDeLista(){
        //lista.remove(elemento)
    }
    public boolean materialEsConsistente(MaterialPrenda materialPrenda){
        return true;
    }
    public boolean tramaEsConsistente(TramaPrenda tramaPrenda){
        return true;
    }
    public boolean coloresSonConsistentes(ColoresPrenda colores){
        return true;
    }

    final TipoPrenda ZAPATO = new TipoPrenda(CategoriaPrenda.CALZADO, null, null, null);
    final TipoPrenda PARTE_SUPERIOR = new TipoPrenda(CategoriaPrenda.PARTE_SUPERIOR, null, null, null);
    final TipoPrenda PARTE_INFERIOR = new TipoPrenda(CategoriaPrenda.PARTE_INFERIOR,null, null, null);
}


