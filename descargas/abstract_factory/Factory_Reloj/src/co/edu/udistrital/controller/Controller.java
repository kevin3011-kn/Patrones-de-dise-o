package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.*;
import co.edu.udistrital.model.concretoCreador.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	RelojFactory relojDigitalFactory = new RelojDigitalFactory();
        Reloj relojDigital = relojDigitalFactory.crearReloj();
        vista.mostrarInformacion(relojDigital.mostrarHora());

     
        RelojFactory relojAnalogicoFactory = new RelojAnalogicoFactory();
        Reloj relojAnalogico = relojAnalogicoFactory.crearReloj();
        vista.mostrarInformacion(relojAnalogico.mostrarHora());
        
    }
    
}
