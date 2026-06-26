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
    	
        PizzaFactory fabricaMargherita = new PizzaMargheritaFactory();
        Pizza pizza1 = fabricaMargherita.crearPizza();
        vista.mostrarInformacion(pizza1.preparar());

    
        PizzaFactory fabricaPepperoni = new PizzaPepperoniFactory();
        Pizza pizza2 = fabricaPepperoni.crearPizza();
        vista.mostrarInformacion(pizza2.preparar());
    
    }
    
}
