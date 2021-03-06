package Entity;

import Domain.Colores;
import Domain.Material;
import Domain.Tipo;
import Domain.Trama;
import Exception.PrendaInvalidaException;

public class Prenda {
    Material materialPrenda;
    Colores coloresPrenda;

    //Como usuarie de QuéMePongo, quiero especificar qué trama tiene la tela de una prenda (lisa, rayada, con lunares, a cuadros o un estampado).
    Trama tramaPrenda;

    //Puedo agregar la categoria de la prenda dentro del tipo prenda para evitar la validacion
    Prenda(Tipo tipoPrenda, Material materialPrenda, Colores coloresPrenda, Trama tramaPrenda) throws Exception {

        try{
            if (this.prendaEsValida(tipoPrenda, materialPrenda, coloresPrenda, tramaPrenda)) {
                this.tipoPrenda = tipoPrenda;
                this.materialPrenda = materialPrenda;
                this.coloresPrenda= coloresPrenda;
                this.tramaPrenda = tramaPrenda;
            }

        }catch (PrendaInvalidaException e){
            throw e;
        }
    }

    private boolean prendaEsValida(Tipo tipoPrenda, Material materialPrenda, Colores coloresPrenda, Trama tramaPrenda) throws Exception {
        if (tipoPrenda == null){
            throw new PrendaInvalidaException("Falta ingresar Tipo De Prenda");
        }
        if (materialPrenda == null || !tipoPrenda.materialEsConsistente(materialPrenda)){
            throw new PrendaInvalidaException("material de prenda inválido");
        }
        return true;
    }


    //CUARTA ITERACION

    //Como usuarie de QuéMePongo, quiero que al generar una sugerencia las prendas sean acordes a la temperatura actual sabiendo
    //que para cada prenda habrá una temperatura
    //hasta la cual es adecuada. (Ej.: “Remera de mangas largas” no es apta a más de 20°C)
    Integer temperaturaLimite;
    Tipo tipoPrenda;
    public Boolean esAdecuadaPara(Integer unaTemperatura){
        return unaTemperatura <= temperaturaLimite;
    }

}
