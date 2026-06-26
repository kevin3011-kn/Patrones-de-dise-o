package co.edu.udistrital.controller;

import co.edu.udistrital.model.Builder;

public class ComputerDirector {
    private Builder builder;

    public ComputerDirector(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder) {
        this.builder = builder;
    }

    public void make(String type) {
        builder.reset();
        builder.buildCpu();
        builder.buildRam();
        builder.buildGpu();
        builder.buildStorage();
    }
}
