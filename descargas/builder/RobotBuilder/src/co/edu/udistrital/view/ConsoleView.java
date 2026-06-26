package co.edu.udistrital.view;

import co.edu.udistrital.model.Robot;

public class ConsoleView {
    public void mostrarRobot(Robot robot) {
        System.out.println("Robot construido: " + robot.toString());
    }
}