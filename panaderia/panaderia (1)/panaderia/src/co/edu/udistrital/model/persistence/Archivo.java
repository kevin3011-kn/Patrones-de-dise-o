package co.edu.udistrital.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.udistrital.model.Producto;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File ubicacionArchivo = new File("data/datos.dat");
	
	public Archivo() {
		
		File carpeta = new File("data");
		if (!carpeta.exists()) {
		    carpeta.mkdir();
		}
		if(!ubicacionArchivo.exists()) {
			try {
				
				ubicacionArchivo.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void escribirArchivo(ArrayList<Producto> clientes) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivo));
			ArrayList<ProductoDTO> datos = MapHandler.convertirProductoaProductoDTO(clientes);
			salida.writeObject(datos);
			salida.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Producto> leerArchivo(){
		ArrayList<Producto> clientes = new ArrayList<>();;
		
		if(ubicacionArchivo.length()!=0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivo));
				ArrayList<ProductoDTO> datos  = (ArrayList<ProductoDTO>) entrada.readObject();
				clientes = MapHandler.convertirPanaderiaDTOaPanaderia(datos);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return clientes;
	}

	public ObjectInputStream getEntrada() {
		return entrada;
	}

	public void setEntrada(ObjectInputStream entrada) {
		this.entrada = entrada;
	}

	public ObjectOutputStream getSalida() {
		return salida;
	}

	public void setSalida(ObjectOutputStream salida) {
		this.salida = salida;
	}

	public File getUbicacionArchivo() {
		return ubicacionArchivo;
	}

	public void setUbicacionArchivo(File ubicacionArchivo) {
		this.ubicacionArchivo = ubicacionArchivo;
	}
	
}
