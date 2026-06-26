package co.edu.udistrital.model;

public class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder() {
        this.reset();
    }

    public void reset() {
        computer = new Computer();
    }

    public void buildCpu() {
        computer.setCpu("Intel i9");
    }

    public void buildRam() {
        computer.setRam("32GB");
    }

    public void buildStorage() {
        computer.setStorage("1TB NVMe");
    }

    public void buildGpu() {
        computer.setGpu("RTX 4090");
    }

    public Computer getResult() {
        return computer;
    }
}
