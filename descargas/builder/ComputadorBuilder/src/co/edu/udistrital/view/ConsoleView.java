package co.edu.udistrital.view;

import co.edu.udistrital.model.Computer;

public class ConsoleView {
    public void mostrarComputadora(Computer computadora) {
        System.out.println("Computadora construida: ");
        System.out.println(computadora.toString());
    }
}