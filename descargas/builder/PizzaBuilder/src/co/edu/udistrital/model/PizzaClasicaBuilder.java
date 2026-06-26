package co.edu.udistrital.model;

public class PizzaClasicaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PizzaClasicaBuilder() {
        reset();
    }

    public void reset() {
        pizza = new Pizza();
    }

    public void buildMasa() {
        pizza.setMasa("tradicional");
    }

    public void buildSalsa() {
        pizza.setSalsa("tomate");
    }

    public void buildIngredientes() {
        pizza.setIngredientes("queso, jamón y champiñones");
    }

    public Pizza getResult() {
        return pizza;
    }
}