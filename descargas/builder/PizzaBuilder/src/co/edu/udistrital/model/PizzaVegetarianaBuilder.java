package co.edu.udistrital.model;

public class PizzaVegetarianaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PizzaVegetarianaBuilder() {
        reset();
    }

    public void reset() {
        pizza = new Pizza();
    }

    public void buildMasa() {
        pizza.setMasa("integral");
    }

    public void buildSalsa() {
        pizza.setSalsa("pesto");
    }

    public void buildIngredientes() {
        pizza.setIngredientes("tomate, albahaca y champiñones");
    }

    public Pizza getResult() {
        return pizza;
    }
}
