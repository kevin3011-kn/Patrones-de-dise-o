package model;

import java.util.ArrayList;
import java.util.List;

public class Gerente implements ComponenteEmpleado {
    private String nombre;
    private List<ComponenteEmpleado> subordinados = new ArrayList<>();

    public Gerente(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteEmpleado e) {
        subordinados.add(e);
    }

    public void mostrarDetalles() {
        System.out.println("Gerente: " + nombre);
        for (ComponenteEmpleado e : subordinados) {
            e.mostrarDetalles();
        }
    }
}
