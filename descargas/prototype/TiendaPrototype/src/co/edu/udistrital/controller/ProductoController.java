package co.edu.udistrital.controller;

import co.edu.udistrital.model.Producto;
import co.edu.udistrital.view.VistaConsola;

public class ProductoController {
	private VistaConsola vista;

	public ProductoController() {
		vista = new VistaConsola();
	}

	public void run() {
		Producto original = new Producto("Camiseta", 49.99);
		vista.mostrarInformacion("Producto original: " + original.getNombre() + " - $" + original.getPrecio());

		Producto clon = (Producto) original.clone();
		vista.mostrarInformacion("Producto clonado: " + clon.getNombre() + " - $" + clon.getPrecio());

		original.setPrecio(39.99);
		vista.mostrarInformacion("Producto original con nuevo precio: $" + original.getPrecio());
		vista.mostrarInformacion("Producto clonado sin cambio: $" + clon.getPrecio());
	}
}

