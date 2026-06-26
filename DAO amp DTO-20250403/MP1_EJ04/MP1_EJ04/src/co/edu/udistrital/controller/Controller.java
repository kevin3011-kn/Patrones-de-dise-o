package co.edu.udistrital.controller;

import co.edu.udistrital.model.Mascota;
import co.edu.udistrital.model.Veterinaria;
import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.MascotaDTO;
import co.edu.udistrital.model.persistence.VeterinariaDAO;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	private Veterinaria datos;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
		datos = new Veterinaria();
		int opcion;
		
		
		do {
			vista.mostrarInformacion("\nMENÚ DE MASCOTAS");
			vista.mostrarInformacion("1. Adicionar mascota");
			vista.mostrarInformacion("2. Actualizar mascota");
			vista.mostrarInformacion("3. Eliminar mascota");
			vista.mostrarInformacion("4. Ver datos de una mascota");
			vista.mostrarInformacion("5. Ver todas las mascotas");
			vista.mostrarInformacion("6. Salir");
			
			opcion = vista.leerDatoEntero("Seleccione una opción: ");

			switch (opcion) {
				case 1:
					funcionalidadAdicionar();
					break;
				case 2:
					funcionalidadActualizar();
					break;
				case 3:
					funcionalidadBorrar();
					break;
				case 4:
					funcionalidadVerUno();
					break;
				case 5:
					funcionalidadVerTodos();
					break;
				case 6:
					vista.mostrarInformacion("");
					break;
				default:
					vista.mostrarInformacion("Opción inválida.Lee bien cual opcion quieres y digitala :)");
			}
		} while (opcion != 6);
		
		
		/*
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
		
		vista.mostrarInformacion(veteDAO.getAll());*/
	}
	
	public void funcionalidadAdicionar() {
		String n = vista.leerCadenaTexto("Ingrese nombre de la mascota: ");
		int e = vista.leerDatoEntero("Ingrese edad de la mascota: ");
		String t = vista.leerCadenaTexto("Ingrese tipo de la mascota: ");
		Mascota x = new Mascota(n, e, t);
		MascotaDTO d = MapHandler.convertirMascotaaMascotaDTO(x);
		if(datos.adicionarMascota(d)) {
			vista.mostrarInformacion("Permitio insertar a " + x.getNombre());
		}else {
			vista.mostrarInformacion("NO dejo insertar a " + x.getNombre());
		}
	}
	
	public void funcionalidadBorrar(){
		String n = vista.leerCadenaTexto("Ingrese nombre de la mascota que desea borrar: ");
		int e = vista.leerDatoEntero("Ingrese edad de la mascota que desea borrar: ");
		String t = vista.leerCadenaTexto("Ingrese tipo de la mascota que desea borrar: ");
		Mascota x = new Mascota(n, e, t);
		MascotaDTO d = MapHandler.convertirMascotaaMascotaDTO(x);
		if(datos.borrarMascota(d)) {
			vista.mostrarInformacion("Permitio borrar a " + x.getNombre());
		}else {
			vista.mostrarInformacion("NO dejo borrar a " + x.getNombre());
		}
	}
	
	public void funcionalidadActualizar(){
		
		String n = vista.leerCadenaTexto("Ingrese nombre de la mascota que desea actualizar: ");
		int e = vista.leerDatoEntero("Ingrese edad de la mascota que desea actualizar: ");
		String t = vista.leerCadenaTexto("Ingrese tipo de la mascota de la mascota que desea actualizar: ");
		Mascota x = new Mascota(n, e, t);
		MascotaDTO d = MapHandler.convertirMascotaaMascotaDTO(x);
		
		String n1 = vista.leerCadenaTexto("Ingrese el nuevo nombre de la mascota: ");
		int e1 = vista.leerDatoEntero("Ingrese la nueva edad de la mascota : ");
		String t1 = vista.leerCadenaTexto("Ingrese el nuevo tipo de la mascota: ");
		Mascota x1 = new Mascota(n1, e1, t1);
		MascotaDTO d1 = MapHandler.convertirMascotaaMascotaDTO(x1);
		
		if(datos.actualizarMascota(d,d1)) {
			vista.mostrarInformacion("Permitio actualizar a " + x.getNombre());
		}else {
			vista.mostrarInformacion("NO dejo actualizar a " + x.getNombre());
		}
		
	}
	
	public void funcionalidadVerUno(){
		
	}
	
	public void funcionalidadVerTodos() {
		String rta = datos.verTodasLasMascotas();	
		if(rta != "") {
			vista.mostrarInformacion("Los datos de las mascotas son: \n" + rta);
		}else {
			vista.mostrarInformacion("NO hay información");
		}
	}
	
	
	
}
