package model;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements ArchivoComponente {
    private String nombre;
    private List<ArchivoComponente> contenidos = new ArrayList<>();

    public Carpeta(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ArchivoComponente componente) {
        contenidos.add(componente);
    }

    public void mostrar() {
        System.out.println("Carpeta: " + nombre);
        for (ArchivoComponente c : contenidos) {
            c.mostrar();
        }
    }
}