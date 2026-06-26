package model;

public class Empleado implements ComponenteEmpleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
    }
}
