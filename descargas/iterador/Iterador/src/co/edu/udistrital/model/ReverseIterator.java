package co.edu.udistrital.model;

import java.util.List;

public class ReverseIterator implements Iterator {
    private List<String> lista;
    private int index;

    public ReverseIterator(NombreCollection collection) {
        this.lista = collection.getNombres();
        this.index = lista.size() - 1;
    }

    @Override
    public boolean hasMore() {
        return index >= 0;
    }

    @Override
    public String getNext() {
        return lista.get(index--);
    }
}
