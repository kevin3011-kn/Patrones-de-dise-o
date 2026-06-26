package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class NombreCollection implements IterableCollection {
    private List<String> nombres = new ArrayList<>();

    public void addNombre(String nombre) {
        nombres.add(nombre);
    }

    public List<String> getNombres() {
        return nombres;
    }

    @Override
    public Iterator createIterator() {
        return new NormalIterator(this);
    }
   

    @Override
    public Iterator createReverseIterator() {
        return new ReverseIterator(this);
    }
}
