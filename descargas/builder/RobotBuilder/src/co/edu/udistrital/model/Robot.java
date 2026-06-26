package co.edu.udistrital.model;

public class Robot {
    private String tipoMotor;
    private String herramienta;
    private String software;

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void setHerramienta(String herramienta) {
        this.herramienta = herramienta;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Robot con motor: " + tipoMotor + ", herramienta: " + herramienta + ", software: " + software;
    }
}