package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Pizza;
import co.edu.udistrital.model.abstracto.PizzaFactory;


public class PizzaPepperoniFactory implements PizzaFactory {

    @Override
    public Pizza crearPizza() {
        return new PizzaPepperoni();
    }
}
