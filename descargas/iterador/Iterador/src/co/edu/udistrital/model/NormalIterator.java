package co.edu.udistrital.model;

import java.util.List;

public class NormalIterator implements Iterator {
    private List<String> lista;
    private int index = 0;

    public NormalIterator(NombreCollection collection) {
        this.lista = collection.getNombres();
    }



	@Override
    public boolean hasMore() {
        return index < lista.size();
    }

    @Override
    public String getNext() {
        return lista.get(index++);
    }
}
