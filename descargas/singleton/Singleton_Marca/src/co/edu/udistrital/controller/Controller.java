package co.edu.udistrital.controller;



import co.edu.udistrital.model.MarcaUnica;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	MarcaUnica  obj= MarcaUnica.getinstancia();
    	MarcaUnica otra = MarcaUnica.getinstancia();
    	
        obj.setPruebaInstancia("ADIDAS");
        obj.setPruebaInstancia("NIKE");
        obj.setPruebaInstancia("Lacoste");
        vista.mostrarInformacion(otra.getPruebaInstancia());
        vista.mostrarInformacion(obj.getPruebaInstancia());
        
        obj.setPruebaInstancia("LACOSTE");
        obj.setPruebaInstancia("PUMA");
        vista.mostrarInformacion(otra.getPruebaInstancia());
        vista.mostrarInformacion(obj.getPruebaInstancia());
       
       
            
            
    }
        
}
