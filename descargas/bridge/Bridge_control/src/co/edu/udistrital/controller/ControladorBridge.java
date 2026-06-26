package co.edu.udistrital.controller;

import co.edu.udistrital.model.ControlRemoto;
import co.edu.udistrital.view.VistaControl;

public class ControladorBridge {
    private ControlRemoto control;
    private VistaControl vista;

    public ControladorBridge(ControlRemoto control, VistaControl vista) {
        this.control = control;
        this.vista = vista;
    }

    public void encender() {
        vista.mostrar();
        control.activar();
    }

    public void apagar() {
        control.desactivar();
    }
}