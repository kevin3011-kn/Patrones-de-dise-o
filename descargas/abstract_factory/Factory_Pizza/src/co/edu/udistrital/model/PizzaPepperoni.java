package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Pizza;


public class PizzaPepperoni extends Pizza {

    public PizzaPepperoni() {
        nombre = "Pizza Pepperoni";
        ingredientes = "Tomate, Mozzarella, Pepperoni";
    }

    @Override
    public String preparar() {
        return "Preparando la Pizza Pepperoni con " + ingredientes;
    }
}
