package co.edu.udistrital.controller;

public class Main {
    public static void main(String[] args) {
        PizzaController controller = new PizzaController();
        controller.construirPizza("clasica");
        controller.construirPizza("vegetariana");
    }
}