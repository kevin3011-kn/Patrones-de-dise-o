package co.edu.udistrital.model.persistence;

import java.io.IOException;
import java.util.ArrayList;
import co.edu.udistrital.model.Producto;

public class PanaderiaDAO implements InterfaceDAO<Producto>{

	private ArrayList<Producto> datos;
	private Archivo archivo;
	
	public PanaderiaDAO() {
		datos = new ArrayList<Producto>();
		archivo = new Archivo();
	}
	
	public ArrayList<Producto> leerTodos() {
	    return archivo.leerArchivo();
	}
	
	public void actualizarBD() {
		ArrayList<Producto> leido = archivo.leerArchivo();
	    if (leido != null) {
	        datos = leido;
	    } else {
	        datos = new ArrayList<>(); 
	    }
		
	}
	
	@Override
	public String getAll() {
		String rta = "";
		datos = archivo.leerArchivo();
		if(!datos.isEmpty()) {
			for(Producto x : datos) {
				rta += x + "\n";
			}
		}
		return rta;
	}

	@Override
	public boolean add(Producto x) {
		if(find(x) == null) {
			datos.add(x);
			archivo.escribirArchivo(datos);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Producto x) {
		Producto y = find(x);
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
	public boolean update(Producto x, Producto y) {
		Producto e = find(x);
		if(e != null) {
			try {
				datos.remove(e);
				e.setPrecio(y.getPrecio());
				e.setCantidad(y.getCantidad());
				e.setPrecioProduccion(y.getPrecioProduccion());
				e.setPrecioVenta(y.getPrecioVenta());
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
	public Producto find(Producto x) {
		Producto encontrado = null;
		if(datos != null) {
			if(!datos.isEmpty()) {
				for(Producto y : datos) {
					if( y.getNombre().equals(x.getNombre())) {
						encontrado = y;
					}
				}
			}
		}
		return encontrado;
	}
	
	
}
