package co.edu.udistrital.model;

public interface PizzaBuilder {
    void reset();
    void buildMasa();
    void buildSalsa();
    void buildIngredientes();
    Pizza getResult();
}
