package co.edu.udistrital.controller;

import co.edu.udistrital.model.Robot;
import co.edu.udistrital.model.RobotBuilder;
import co.edu.udistrital.model.RobotIndustrialBuilder;
import co.edu.udistrital.model.RobotLimpiezaBuilder;
import co.edu.udistrital.view.ConsoleView;

public class RobotController {
    private ConsoleView view;

    public RobotController() {
        view = new ConsoleView();
    }

    public void construirRobot(String tipo) {
        RobotBuilder builder;
        if (tipo.equalsIgnoreCase("industrial")) {
            builder = new RobotIndustrialBuilder();
        } else {
            builder = new RobotLimpiezaBuilder();
        }

        RobotDirector director = new RobotDirector(builder);
        director.makeRobot();

        Robot robot = builder.getResult();
        view.mostrarRobot(robot);
    }
}