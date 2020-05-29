package Entity;

import Domain.Categoria;
import Domain.ClienteDeClima;

import java.util.List;
import java.util.Optional;

import static Domain.Categoria.*;

public class Guardarropas {
    List<Prenda> prendas;
    ClienteDeClima servicioDeClima;

    private Prenda obtenerPrendaAdecuada(Categoria tipoPrenda){
        return this.prendas.stream().filter(p ->(p.tipoPrenda.equals(tipoPrenda)) && p.esAdecuadaPara(servicioDeClima.obtenerClimaDe("buenosAires")))
                .findAny().orElseThrow(RuntimeException::new);
    }
    public Atuendo generarAtuendo(){
        Integer temperatura = servicioDeClima.obtenerClimaDe("buenosAires");
        return new Atuendo(this.obtenerPrendaAdecuada(Categoria.PARTE_SUPERIOR),
                this.obtenerPrendaAdecuada(PARTE_INFERIOR),
                this.obtenerPrendaAdecuada(CALZADO),
                this.obtenerPrendaAdecuada(ACCESORIOS));
    }

}
