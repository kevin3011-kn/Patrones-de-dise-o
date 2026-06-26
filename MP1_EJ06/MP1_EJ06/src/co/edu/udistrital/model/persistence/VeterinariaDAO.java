package co.edu.udistrital.model.persistence;

import java.io.IOException;
import java.util.ArrayList;
import co.edu.udistrital.model.Mascota;

public class VeterinariaDAO implements InterfaceDAO<Mascota>{

	private ArrayList<Mascota> datos;
	private Archivo archivo;
	
	public VeterinariaDAO() {
		datos = new ArrayList<Mascota>();
		archivo = new Archivo();
	}
	
	public void actualizarBD() {
		if(datos != null) {
			datos = archivo.leerArchivo();
		}
		
	}
	
	@Override
	public String getAll() {
		String rta = "";
		datos = archivo.leerArchivo();
		if(!datos.isEmpty()) {
			for(Mascota x : datos) {
				rta += x + "\n";
			}
		}
		return rta;
	}

	@Override
	public boolean add(Mascota x) {
		if(find(x) == null) {
			datos.add(x);
			archivo.escribirArchivo(datos);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Mascota x) {
		Mascota y = find(x);
		if(y != null) {
			try {
				datos.remove(y);
				archivo.getUbicacionArchivo().delete();
				archivo.getUbicacionArchivo().createNewFile();
				archivo.escribirArchivo(datos);
				return true;
			}catch (IOException e) {
				e.printStackTrace();
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean update(Mascota x, Mascota y) {
		Mascota e = find(x);
		if(e != null) {
			try {
				datos.remove(e);
				e.setEdad(y.getEdad());
				e.setTipo(y.getTipo());
				datos.add(e);
				archivo.getUbicacionArchivo().delete();
				archivo.getUbicacionArchivo().createNewFile();
				archivo.escribirArchivo(datos);
				return true;
			}catch (IOException ex) {
				ex.printStackTrace();
				return false;
			}
		}
		return false;
	}

	@Override
	public Mascota find(Mascota x) {
		Mascota encontrado = null;
		if(datos != null) {
			if(!datos.isEmpty()) {
				for(Mascota y : datos) {
					if( y.getNombre().equals(x.getNombre())) {
						encontrado = y;
					}
				}
			}
		}
		return encontrado;
	}
}
