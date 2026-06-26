package model;

public class MenuItem implements MenuComponente {
    private String nombre;

    public MenuItem(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Item: " + nombre);
    }
}