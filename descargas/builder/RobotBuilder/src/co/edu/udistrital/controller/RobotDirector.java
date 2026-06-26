package co.edu.udistrital.controller;

import co.edu.udistrital.model.RobotBuilder;

public class RobotDirector {
    private RobotBuilder builder;

    public RobotDirector(RobotBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(RobotBuilder builder) {
        this.builder = builder;
    }

    public void makeRobot() {
        builder.reset();
        builder.buildMotor();
        builder.buildHerramienta();
        builder.buildSoftware();
    }
}