package co.edu.udistrital.model.abstracto;

public abstract class Pizza {
    protected String nombre;
    protected String ingredientes;

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public abstract String preparar();
}
