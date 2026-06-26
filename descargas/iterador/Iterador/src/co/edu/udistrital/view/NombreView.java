package co.edu.udistrital.view;

import java.util.Scanner;

public class NombreView {

	private Scanner scanner = new Scanner(System.in);

    public String pedirNombre() {
        System.out.print("Ingrese un nombre (o 'fin' para terminar): ");
        return scanner.nextLine();
    }

    public int pedirTipoIterador() {
        System.out.print("Seleccione tipo de recorrido (1 = normal, 2 = inverso): ");
        return scanner.nextInt();
    }

    public void mostrarNombre(String nombre) {
        System.out.println(">> " + nombre);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
