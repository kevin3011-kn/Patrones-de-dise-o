package co.edu.udistrital.model;

public class Producto {
	
	private String nombre;
	private int precio;
	private int cantidad;
	private int precioProduccion;
	private int precioVenta;
	private String adicional; 

	
	public Producto(String nombre, int precio, int cantidad, int precioProduccion, int precioVenta) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.precioProduccion = precioProduccion;
		this.precioVenta = precioVenta;
	}
	
	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getPrecioProduccion() {
		return precioProduccion;
	}


	public void setPrecioProduccion(int precioProduccion) {
		this.precioProduccion = precioProduccion;
	}


	public int getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public String getAdicional() {
	    return adicional;
	}

	public void setAdicional(String adicional) {
	    this.adicional = adicional;
	}
	
	
	
	
	

}
