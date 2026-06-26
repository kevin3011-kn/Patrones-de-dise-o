package model;

import java.util.ArrayList;
import java.util.List;

public class MenuGrupo implements MenuComponente {
    private String nombre;
    private List<MenuComponente> items = new ArrayList<>();

    public MenuGrupo(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(MenuComponente item) {
        items.add(item);
    }

    public void mostrar() {
        System.out.println("Menú: " + nombre);
        for (MenuComponente item : items) {
            item.mostrar();
        }
    }
}