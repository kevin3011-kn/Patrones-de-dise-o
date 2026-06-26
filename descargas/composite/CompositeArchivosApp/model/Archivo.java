package model;

public class Archivo implements ArchivoComponente {
    private String nombre;

    public Archivo(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Archivo: " + nombre);
    }
}