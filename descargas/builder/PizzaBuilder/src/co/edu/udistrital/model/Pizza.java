package co.edu.udistrital.model;

public class Pizza {
    private String masa;
    private String salsa;
    private String ingredientes;

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Pizza con masa " + masa + ", salsa " + salsa + " y " + ingredientes;
    }
}
