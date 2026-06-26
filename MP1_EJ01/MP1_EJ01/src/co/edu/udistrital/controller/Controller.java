package co.edu.udistrital.controller;

import co.edu.udistrital.model.Cilindro;
import co.edu.udistrital.view.VistaConsola;
import co.edu.udistrital.view.VistaVentanasEmergentes;

public class Controller {

	//private VistaConsola vista;
	private VistaVentanasEmergentes vista;
	private Cilindro cil;
	
	public Controller() {
		//vista = new VistaConsola();
		vista = new VistaVentanasEmergentes();
		cil = new Cilindro();
	}
	
	public void run() {
		double aux = 0.0;
		aux = vista.leerDatoReal("Ingrese radio del cilindro: ");
		cil.setRadio(aux);
		aux = vista.leerDatoReal("Ingrese altura del cilindro: ");
		cil.setAltura(aux);
		cil.calcularVolumen();
		vista.mostrarInformacion("El volumen del cilindro es " + cil.getVolumen());
		vista.mostrarInformacion(cil.toString());
	}
	
}
