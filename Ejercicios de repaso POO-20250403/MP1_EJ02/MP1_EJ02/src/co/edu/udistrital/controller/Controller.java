package co.edu.udistrital.controller;

import co.edu.udistrital.model.Bicicleta;
import co.edu.udistrital.model.MedioTransporte;
import co.edu.udistrital.model.Patineta;
import co.edu.udistrital.view.VistaConsola;
import co.edu.udistrital.view.VistaVentanasEmergentes;

public class Controller {

	private VistaConsola vista;
	//private VistaVentanasEmergentes vista;
	
	public Controller() {
		vista = new VistaConsola();
		//vista = new VistaVentanasEmergentes();
	}
	
	public void run() {
		String a1 = vista.leerCadenaTexto("Ingrese Marca Bicicleta: ");
		String a2 = vista.leerCadenaTexto("Ingrese Tipo Bicicleta: ");
		int p1 = vista.leerDatoEntero("Ingrese Precio Bicicleta: ");
		
		Bicicleta b = new Bicicleta();
		b.setMarca(a1);
		b.setTipo(a2);
		b.setPrecio(p1);
		
		//Bicicleta c = new Bicicleta(a2, p1, a1);
		
		//vista.mostrarInformacion(b.toString());
		//vista.mostrarInformacion(c.toString());
		//vista.mostrarInformacion(b.frenar());
		//vista.mostrarInformacion(b.frenar());
		vista.mostrarInformacion(b.frenar());
		vista.mostrarInformacion(b.acelerar());
		vista.mostrarInformacion(b.hacerCambio());
		
		
		String x1 = vista.leerCadenaTexto("Ingrese Marca Patineta: ");
		int x2 = vista.leerDatoEntero("Ingrese Precio Patineta");
		
		Patineta d = new Patineta();
		d.setPrecio(x2);
		d.setMarca(x1);
		/*
		vista.mostrarInformacion(d.toString());
		vista.mostrarInformacion(d.acelerar());
		vista.mostrarInformacion(d.acelerar());
		vista.mostrarInformacion(d.frenar());
		*/
		MedioTransporte z1;
		
		z1 = new Patineta();
		vista.mostrarInformacion(z1.acelerar());
		z1 = new Bicicleta();
		vista.mostrarInformacion(z1.acelerar());
		//vista.mostrarInformacion(z1.hacerCambio());
	}
	
}
