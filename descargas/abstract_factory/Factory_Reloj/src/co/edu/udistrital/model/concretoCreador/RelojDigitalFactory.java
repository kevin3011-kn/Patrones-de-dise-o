package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Reloj;
import co.edu.udistrital.model.abstracto.RelojFactory;



public class RelojDigitalFactory implements RelojFactory {

    @Override
    public Reloj crearReloj() {
        return new RelojDigital();
    }
}
