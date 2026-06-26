package co.edu.udistrital.controller;

import co.edu.udistrital.model.TV;


import co.edu.udistrital.view.VistaControl;

public class main {
	public static void main(String[] args) {
		
        Dispositivo tv = new TV();
        ControlRemoto control = new ControlBasico(tv);
        VistaControl vista = new VistaControl();
        ControladorBridge controlador = new ControladorBridge(control, vista);

        controlador.encender();
        controlador.apagar();
    }
}