package co.edu.udistrital.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.udistrital.model.Mascota;

public class Archivo {

	private ObjectInputStream entrada;
	private ObjectOutputStream salida;
	private File ubicacionArchivo = new File("data/datos.dat");
	
	public Archivo() {
		if(!ubicacionArchivo.exists()) {
			try {
				ubicacionArchivo.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void escribirArchivo(ArrayList<Mascota> clientes) {
		try {
			salida = new ObjectOutputStream(new FileOutputStream(ubicacionArchivo));
			ArrayList<MascotaDTO> datos = MapHandler.convertirMascotaaMascotaDTO(clientes);
			salida.writeObject(datos);
			salida.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Mascota> leerArchivo(){
		ArrayList<Mascota> clientes = null;
		
		if(ubicacionArchivo.length()!=0) {
			try {
				entrada = new ObjectInputStream(new FileInputStream(ubicacionArchivo));
				ArrayList<MascotaDTO> datos  = (ArrayList<MascotaDTO>) entrada.readObject();
				clientes = MapHandler.convertirVeterinariaDTOaVeterinaria(datos);
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
