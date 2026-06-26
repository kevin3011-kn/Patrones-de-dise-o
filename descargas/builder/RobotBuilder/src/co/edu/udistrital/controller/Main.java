package co.edu.udistrital.controller;

public class Main {
	public static void main(String[] args) {
        RobotController controller = new RobotController();
        controller.construirRobot("limpieza");
        controller.construirRobot("industrial");
    }

}
