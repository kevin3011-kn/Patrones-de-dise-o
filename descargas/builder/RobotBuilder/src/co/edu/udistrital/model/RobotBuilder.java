package co.edu.udistrital.model;

public interface RobotBuilder {
    void reset();
    void buildMotor();
    void buildHerramienta();
    void buildSoftware();
    Robot getResult();
}
