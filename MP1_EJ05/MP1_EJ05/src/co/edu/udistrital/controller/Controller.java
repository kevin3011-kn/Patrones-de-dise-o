package co.edu.udistrital.controller;

import co.edu.udistrital.model.Mascota;
import co.edu.udistrital.model.Veterinaria;
import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.MascotaDTO;
import co.edu.udistrital.model.persistence.VeterinariaDAO;
import co.edu.udistrital.view.VistaConsola;


public class Controller {

	private VistaConsola vista;
	private Veterinaria veterinaria;
	
	public Controller() {
		vista = new VistaConsola();
		
	}
	
	public void run() {
		veterinaria = new Veterinaria();
		veterinaria.actualizarBD();
		
		String menu = ".: MENU DE OPERACIONES :." + "\n" +
					"       1. Ingresar Mascota" + "\n" +
					"       2. Ver Todas las mascota" + "\n" +
					"       3. Salir de la App" + "\n" +
					"Digite opcion: ";
		int opcion = 0;
				
		do {
			opcion = vista.leerDatoEntero(menu);
			switch (opcion) {
			
			case 1:
				ingresarMascota();
				break;
				
			case 2:
				verTodos();
				break;
				
			case 3:
				despedidaUsuario();
				break;
				
			default:
				errorIngresoUsuario();
				break;
			}
		}while(opcion != 3);
		
	}
	
	public void ingresarMascota() {
		String nombre = "";
		String tipo = "";
		int edad = 0;
		nombre = vista.leerCadenaTexto("Ingrese nombre de la nueva mascota: ");
		tipo = vista.leerCadenaTexto("Ingrese tipo de la nueva mascota: ");
		edad = vista.leerDatoEntero("Ingrese edad de la nueva mascota: ");
		MascotaDTO x = new MascotaDTO();
		x.setNombre(nombre);
		x.setEdad(edad);
		x.setTipo(tipo);
		if(veterinaria.adicionarMascota(x)) {
			vista.mostrarInformacion("Se ingreso con exito el registro :)");
		}else {
			vista.mostrarInformacion("No fue posible el registro :(");
		}
	}
	
	public void verTodos() {
		String data = veterinaria.obtenerListaClientes();
		vista.mostrarInformacion("Los clientes son: \n" + data);
	}
	
	public void despedidaUsuario() {
		vista.mostrarInformacion("Suerte Agonia :)");
	}
	
	public void errorIngresoUsuario() {
		vista.mostrarInformacion("Idiota: Opcion No Valida :(");
	}
	
	
}
