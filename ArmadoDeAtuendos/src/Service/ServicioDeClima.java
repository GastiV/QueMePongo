package Service;

import Domain.ClienteDeClima;

public class ServicioDeClima {
    //Validar usuario administrador para setear uno distinto
    public void SetMiClienteDeClima(ClienteDeClima nuevoClienteDeClima){
        //Usuario es administrador
        //settear MiClienteClimaActual
    }
    private ServicioDeClima MiClienteDeClimaActual;
    public ServicioDeClima getInstance(){
        return this.MiClienteDeClimaActual;
    }
}
