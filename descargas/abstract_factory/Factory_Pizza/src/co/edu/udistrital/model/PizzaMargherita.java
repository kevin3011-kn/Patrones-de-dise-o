package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Pizza;


public class PizzaMargherita extends Pizza {

    public PizzaMargherita() {
        nombre = "Pizza Margherita";
        ingredientes = "Tomate, Mozzarella, Albahaca";
    }

    @Override
    public String preparar() {
        return "Preparando la Pizza Margherita con " + ingredientes;
    }
}