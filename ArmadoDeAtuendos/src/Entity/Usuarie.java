package Entity;

public class Usuarie {

    Guardarropas guardarropas;
    //Como usuarie de QuéMePongo, quiero poder conocer las condiciones climáticas de Buenos Aires en un momento dado para obtener sugerencias acordes.

    //Como usuarie de QuéMePongo, quiero poder recibir sugerencias de atuendos que tengan una prenda para cada categoría, aunque a futuro podrán tener más (Ej.:
    //Una remera, un pantalón, zapatos y un gorro).
    public Atuendo generarSugerencia(){
        return guardarropas.generarAtuendo();
    }
}
