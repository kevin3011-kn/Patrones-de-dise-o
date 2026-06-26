package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner sc;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
	public double leerDatoReal(String mensaje) {
		System.out.println(mensaje);
		return sc.nextDouble();
	}
	
	public int leerDatoEntero(String mensaje) {
		System.out.println(mensaje);
		int dato = sc.nextInt();
		sc.nextLine();
		return dato;
	}
	
	public String leerCadenaTexto(String mensaje) {
		System.out.println(mensaje);
		return sc.nextLine();
	}
}
