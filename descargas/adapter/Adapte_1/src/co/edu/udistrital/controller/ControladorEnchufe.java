package co.edu.udistrital.controller;

import co.edu.udistrital.model.EnchufeEuropeo;
import co.edu.udistrital.view.VistaEnchufe;

public class ControladorEnchufe {

	private EnchufeEuropeo europeo;
    private VistaEnchufe vista;

    public ControladorEnchufe(EnchufeEuropeo europeo, VistaEnchufe vista) {
        this.europeo = europeo;
        this.vista = vista;
    }

    public void conectar() {
        vista.mostrarConexion();
        europeo.conectar220V();
    }
}
