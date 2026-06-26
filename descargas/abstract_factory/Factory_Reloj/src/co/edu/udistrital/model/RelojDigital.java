package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Reloj;

public class RelojDigital extends Reloj {

    public RelojDigital() {
        this.hora = "12:45:00";
    }

    @Override
    public String mostrarHora() {
        return "Hora digital: " + hora;
    }
}