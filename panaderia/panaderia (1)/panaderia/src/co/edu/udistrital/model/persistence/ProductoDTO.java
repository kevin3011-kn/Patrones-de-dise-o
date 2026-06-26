package co.edu.udistrital.model.persistence;

import java.io.Serializable;

public class ProductoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int precio;
	private int cantidad;
	private int precioProduccion;
	private int precioVenta;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
		
}
