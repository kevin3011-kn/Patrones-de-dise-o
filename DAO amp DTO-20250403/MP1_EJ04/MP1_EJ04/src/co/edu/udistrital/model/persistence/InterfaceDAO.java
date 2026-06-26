package co.edu.udistrital.model.persistence;

public interface InterfaceDAO <T> {

	String getAll();
	T find(T x);
	boolean add(T x);
	boolean update(T x, T y);
	boolean delete(T x);
	
}
