package co.edu.udistrital.controller;

import co.edu.udistrital.model.Vehiculo;
import co.edu.udistrital.view.VistaConsola;

public class VehiculoController {
	private VistaConsola vista;

	public VehiculoController() {
		vista = new VistaConsola();
	}

	public void run() {
		Vehiculo v1 = new Vehiculo("Toyota", "Corolla");
		vista.mostrarInformacion("Vehículo original: " + v1.getMarca() + " " + v1.getModelo());

		Vehiculo v2 = (Vehiculo) v1.clone();
		vista.mostrarInformacion("Vehículo clonado: " + v2.getMarca() + " " + v2.getModelo());

		v1.setModelo("Yaris");
		vista.mostrarInformacion("Vehículo original modificado: " + v1.getModelo());
		vista.mostrarInformacion("Vehículo clonado sin cambio: " + v2.getModelo());
	}
}

