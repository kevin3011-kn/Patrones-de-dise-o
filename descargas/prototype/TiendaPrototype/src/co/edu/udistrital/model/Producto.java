package co.edu.udistrital.model;

public class Producto implements Prototype {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(Producto original) {
		this.nombre = original.nombre;
		this.precio = original.precio;
	}

	@Override
	public Prototype clone() {
		return new Producto(this);
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double nuevoPrecio) {
		this.precio = nuevoPrecio;
	}
}
