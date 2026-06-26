package co.edu.udistrital.controller;

import co.edu.udistrital.model.EdificioUnico;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	EdificioUnico  obj= EdificioUnico.getinstancia();//creacio  de la instancia unica
        EdificioUnico otra = EdificioUnico.getinstancia();
        obj.setPruebaInstancia("UNIVERSIDAD DISTRITAL");
        vista.mostrarInformacion(otra.getPruebaInstancia());
       
        EdificioUnico  obj1 = EdificioUnico.getinstancia(); // creacion normal de un objeto
        EdificioUnico  otra1= EdificioUnico.getinstancia(); 
        obj1.setPruebaInstancia("UNIVERSIDAD PEDAGOGICA");
        vista.mostrarInformacion(otra1.getPruebaInstancia());
            
    }
        
}
