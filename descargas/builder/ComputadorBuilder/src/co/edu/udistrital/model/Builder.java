package co.edu.udistrital.model;

public interface Builder {
    void reset();
    void buildCpu();
    void buildRam();
    void buildStorage();
    void buildGpu();
    Computer getResult();
}
