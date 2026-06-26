package co.edu.udistrital.model;

public class Vehiculo implements Prototype {
	private String marca;
	private String modelo;

	public Vehiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(Vehiculo original) {
		this.marca = original.marca;
		this.modelo = original.modelo;
	}

	@Override
	public Prototype clone() {
		return new Vehiculo(this);
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

