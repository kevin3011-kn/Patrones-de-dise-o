package co.edu.udistrital.controller;


import co.edu.udistrital.model.TransporteUnico;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	TransporteUnico  obj= TransporteUnico.getinstancia();
    	TransporteUnico otra = TransporteUnico.getinstancia();
        obj.setPruebaInstancia("VEHICULO");
        otra.setPruebaInstancia("MOTO");
        vista.mostrarInformacion(otra.getPruebaInstancia());
        otra.setPruebaInstancia("BARCO"); 
        obj.setPruebaInstancia("SUBMARINO");
        vista.mostrarInformacion(obj.getPruebaInstancia());
            
            
    }
        
}
