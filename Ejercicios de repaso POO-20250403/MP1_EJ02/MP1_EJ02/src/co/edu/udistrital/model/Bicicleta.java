package co.edu.udistrital.model;

public class Bicicleta implements MedioTransporte {

	private String tipo;
	private int precio;
	private String marca;
	
	public Bicicleta() {
		tipo = "";
		precio = 0;
		marca = "";
	}
	
	public String hacerCambio() {
		return "Hacer cambio del piñon trasero";
	}
	
	public Bicicleta(String tipo, int precio, String marca) {
		this.tipo = tipo;
		this.precio = precio;
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String frenar() {
		return "Frenar Bicicleta, que nos matamos!!!";
	}

	@Override
	public String acelerar() {
		return "Acelerar Bicicleta, que vamos tarde!!!";
	}

	@Override
	public String toString() {
		return "Bicicleta [tipo=" + tipo + ", precio=" + precio + ", marca=" + marca + "]";
	}
	
	

}
