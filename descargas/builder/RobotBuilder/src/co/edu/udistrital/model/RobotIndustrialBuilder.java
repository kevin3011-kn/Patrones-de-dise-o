package co.edu.udistrital.model;

public class RobotIndustrialBuilder implements RobotBuilder {
    private Robot robot;

    public RobotIndustrialBuilder() {
        reset();
    }

    public void reset() {
        robot = new Robot();
    }

    public void buildMotor() {
        robot.setTipoMotor("hidráulico");
    }

    public void buildHerramienta() {
        robot.setHerramienta("soldadora");
    }

    public void buildSoftware() {
        robot.setSoftware("control numérico");
    }

    public Robot getResult() {
        return robot;
    }
}
