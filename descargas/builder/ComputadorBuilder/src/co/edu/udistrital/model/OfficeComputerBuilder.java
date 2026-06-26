package co.edu.udistrital.model;

public class OfficeComputerBuilder implements Builder {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.reset();
    }

    public void reset() {
        computer = new Computer();
    }

    public void buildCpu() {
        computer.setCpu("Intel i3");
    }

    public void buildRam() {
        computer.setRam("8GB");
    }

    public void buildStorage() {
        computer.setStorage("256GB SSD");
    }

    public void buildGpu() {
        computer.setGpu("Integrada");
    }

    public Computer getResult() {
        return computer;
    }
}
