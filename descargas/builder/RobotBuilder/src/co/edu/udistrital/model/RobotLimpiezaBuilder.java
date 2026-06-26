package co.edu.udistrital.model;

public class RobotLimpiezaBuilder implements RobotBuilder {
    private Robot robot;

    public RobotLimpiezaBuilder() {
        reset();
    }

    public void reset() {
        robot = new Robot();
    }

    public void buildMotor() {
        robot.setTipoMotor("eléctrico");
    }

    public void buildHerramienta() {
        robot.setHerramienta("aspiradora");
    }

    public void buildSoftware() {
        robot.setSoftware("navegación autónoma");
    }

    public Robot getResult() {
        return robot;
    }
}