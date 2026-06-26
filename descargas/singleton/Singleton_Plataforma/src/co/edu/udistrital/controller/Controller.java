package co.edu.udistrital.controller;


import co.edu.udistrital.model.PlataformaUnica;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	PlataformaUnica  obj= PlataformaUnica.getinstancia();
    	PlataformaUnica otra = PlataformaUnica.getinstancia();
        obj.setPruebaInstancia("UBER");
        otra.setPruebaInstancia("PICAP");
        vista.mostrarInformacion(obj.getPruebaInstancia());
        otra.setPruebaInstancia("IN DRIVER");
        vista.mostrarInformacion(otra.getPruebaInstancia());
       
       
            
            
    }
        
}
