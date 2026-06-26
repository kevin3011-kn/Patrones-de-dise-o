package co.edu.udistrital.controller;

import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.VistaConsola;

public class UsuarioController {
	private VistaConsola vista;

	public UsuarioController() {
		vista = new VistaConsola();
	}

	public void run() {
		Usuario u1 = new Usuario("Daniel", "Administrador");
		vista.mostrarInformacion("Usuario original: " + u1.getNombre() + " (" + u1.getRol() + ")");

		Usuario u2 = (Usuario) u1.clone();
		vista.mostrarInformacion("Usuario clonado: " + u2.getNombre() + " (" + u2.getRol() + ")");

		u1.setNombre("Esteban");
		vista.mostrarInformacion("Usuario original modificado: " + u1.getNombre());
		vista.mostrarInformacion("Usuario clonado sin cambio: " + u2.getNombre());
	}
}
