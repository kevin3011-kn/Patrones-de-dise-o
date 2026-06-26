package co.edu.udistrital.model;


import java.util.ArrayList;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class RegistroEventos {

    private static RegistroEventos instancia = null;
    private List<String> eventos;

    private RegistroEventos() {
        eventos = new ArrayList<>();
    }

    public static RegistroEventos getInstancia() {
        if (instancia == null) {
            instancia = new RegistroEventos();
        }
        return instancia;
    }

    public void agregarEvento(String evento) {
        eventos.add(evento);
    }

    public List<String> getEventos() {
        return eventos;
    }

    public void limpiarEventos() {
        eventos.clear();
    }
}