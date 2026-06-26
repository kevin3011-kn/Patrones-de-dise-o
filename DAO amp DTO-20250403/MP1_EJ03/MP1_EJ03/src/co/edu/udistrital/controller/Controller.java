package co.edu.udistrital.controller;

import co.edu.udistrital.model.Mascota;
import co.edu.udistrital.model.persistence.VeterinariaDAO;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		VeterinariaDAO veteDAO = new VeterinariaDAO();
		
		if(veteDAO.add(new Mascota("Luis", 26, "Perro"))) {
			vista.mostrarInformacion("Permitio insertar a LUIS");
		}else {
			vista.mostrarInformacion("NO dejo insertar a LUIS");
		}
		
		if(veteDAO.add(new Mascota("Jully", 30, "Culebra"))) {
			vista.mostrarInformacion("Permitio insertar a JULLY");
		}else {
			vista.mostrarInformacion("NO dejo insertar a JULLY");
		}
		
		if(veteDAO.add(new Mascota("Luis", 22, "Gato"))) {
			vista.mostrarInformacion("Permitio insertar a LUIS2");
		}else {
			vista.mostrarInformacion("NO dejo insertar a LUIS2");
		}
		
		if(veteDAO.update(new Mascota("Jully", 30, "Culebra"), new Mascota ("Jully", 30, "Rata"))) {
			vista.mostrarInformacion("Permitio modificar a JULLY");
		}else {
			vista.mostrarInformacion("NO dejo modificar a JULLY");
		}
		
		vista.mostrarInformacion(veteDAO.getAll());
		
		if(veteDAO.delete(new Mascota("Luis", 26, "Perro"))) {
			vista.mostrarInformacion("Permitio eliminar a LUIS");
		}else {
			vista.mostrarInformacion("NO dejo eliminar a LUIS");
		}
		
		vista.mostrarInformacion(veteDAO.getAll());
	}
	
}
