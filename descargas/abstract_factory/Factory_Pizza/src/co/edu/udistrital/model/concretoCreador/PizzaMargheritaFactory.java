package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Pizza;
import co.edu.udistrital.model.abstracto.PizzaFactory;


public class PizzaMargheritaFactory implements PizzaFactory {

    @Override
    public Pizza crearPizza() {
        return new PizzaMargherita();
    }
}
