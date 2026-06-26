package co.edu.udistrital.model.persistence;

import java.io.Serializable;

public class MascotaDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private String tipo;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
		
}
