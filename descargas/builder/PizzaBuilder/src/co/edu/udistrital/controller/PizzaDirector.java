package co.edu.udistrital.controller;

import co.edu.udistrital.model.PizzaBuilder;

public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    public void makePizza() {
        builder.reset();
        builder.buildMasa();
        builder.buildSalsa();
        builder.buildIngredientes();
    }
}