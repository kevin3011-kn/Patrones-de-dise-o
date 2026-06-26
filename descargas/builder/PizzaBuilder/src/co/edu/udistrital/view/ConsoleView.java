package co.edu.udistrital.view;

import co.edu.udistrital.model.Pizza;

public class ConsoleView {
    public void mostrarPizza(Pizza pizza) {
        System.out.println("Pizza construida: " + pizza.toString());
    }
}
