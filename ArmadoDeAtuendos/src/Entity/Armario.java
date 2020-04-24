package Entity;

import java.util.List;

public class Armario {
    List<Prenda> Prendas;

    Armario(List<Prenda> prendas){
        this.Prendas = prendas;
    }
    public List<Prenda> getPrendas() {
        return Prendas;
    }

    private void agregarElementoALista(List<Prenda> listaDePrendas,Prenda nuevaPrenda){
        listaDePrendas.add(nuevaPrenda);
    }
    private void eliminarElementoDeLista(List<Prenda> listaDePrendas,Prenda nuevaPrenda){
        listaDePrendas.remove(nuevaPrenda);
    }
    public void agregarPrenda(Prenda prenda){
        this.agregarElementoALista(this.getPrendas(), prenda);
    }

}
