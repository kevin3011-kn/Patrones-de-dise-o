package co.edu.udistrital.controller;

import co.edu.udistrital.model.Pizza;
import co.edu.udistrital.model.PizzaBuilder;
import co.edu.udistrital.model.PizzaClasicaBuilder;
import co.edu.udistrital.model.PizzaVegetarianaBuilder;
import co.edu.udistrital.view.ConsoleView;

public class PizzaController {
    private ConsoleView view;

    public PizzaController() {
        view = new ConsoleView();
    }

    public void construirPizza(String tipo) {
        PizzaBuilder builder;
        if (tipo.equalsIgnoreCase("vegetariana")) {
            builder = new PizzaVegetarianaBuilder();
        } else {
            builder = new PizzaClasicaBuilder();
        }

        PizzaDirector director = new PizzaDirector(builder);
        director.makePizza();

        Pizza pizza = builder.getResult();
        view.mostrarPizza(pizza);
    }
}

