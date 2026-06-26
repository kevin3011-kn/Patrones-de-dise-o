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
    	int a = 0;
    	int b = 0;
    	int c = 0;
    	
        vista.mostrarInformacion("VALORES DE LOS LADOS DEL TRIANGULO");
        
        a = vista.leerDatoEntero("\t" + "Digite valor lado 1: ");
        b = vista.leerDatoEntero("\t" + "Digite valor lado 2: ");
        c = vista.leerDatoEntero("\t" + "Digite valor lado 3: ");
        
        TrianguloFactory fabrica=new TrianguloCreador();
        
        Triangulo triangulo = fabrica.crearTriangulo(a,b,c);
        
        vista.mostrarInformacion("ESTE TRIANGULO ES DE TIPO....." + triangulo.describir() );
        vista.mostrarInformacion("SU SUPERFICIE ES....." + triangulo.calcularSuperficie());
    }
    
}
