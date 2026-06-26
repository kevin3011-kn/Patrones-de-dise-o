package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Reloj;

public class RelojAnalogico extends Reloj {

    public RelojAnalogico() {
        this.hora = "12:45";
    }

    @Override
    public String mostrarHora() {
        return "Hora analógica: " + hora;
    }
}
