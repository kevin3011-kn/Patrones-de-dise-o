package co.edu.udistrital.controller;

import co.edu.udistrital.model.Builder;
import co.edu.udistrital.model.Computer;
import co.edu.udistrital.model.GamingComputerBuilder;
import co.edu.udistrital.model.OfficeComputerBuilder;
import co.edu.udistrital.view.ConsoleView;

public class ComputerController {
    private ConsoleView view;

    public ComputerController() {
        this.view = new ConsoleView();
    }

    public void construirComputadora(String tipo) {
        Builder builder;
        if (tipo.equalsIgnoreCase("gaming")) {
            builder = new GamingComputerBuilder();
        } else {
            builder = new OfficeComputerBuilder();
        }

        ComputerDirector director = new ComputerDirector(builder);
        director.make(tipo);

        Computer computadora = builder.getResult();
        view.mostrarComputadora(computadora);
    }
}
