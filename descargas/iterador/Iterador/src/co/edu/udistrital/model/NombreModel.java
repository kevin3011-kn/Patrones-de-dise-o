package co.edu.udistrital.model;

public class NombreModel {
	
	private NombreCollection collection = new NombreCollection();

    public void agregarNombre(String nombre) {
        collection.addNombre(nombre);
    }

    public Iterator getIteradorNormal() {
        return collection.createIterator();
    }

    public Iterator getIteradorInverso() {
        return collection.createReverseIterator();
    }

}
