package co.edu.udistrital.model.persistence;

import java.util.ArrayList;

import co.edu.udistrital.model.Mascota;

public class VeterinariaDAO implements InterfaceDAO<Mascota>{

	private ArrayList<Mascota> datos;
	
	public VeterinariaDAO() {
		datos = new ArrayList<Mascota>();
	}
	
	@Override
	public String getAll() {
		String resultados = "";
		if(!datos.isEmpty()) {
			for (Mascota mascota : datos) {
				resultados += mascota + "\n";
			}
		}
		return resultados;
	}

	@Override
	public Mascota find(Mascota x) {
		Mascota encontrada = null;
		if(!datos.isEmpty()) {
			for (Mascota mascota : datos) {
				if(x.getNombre().equals(mascota.getNombre())) {
					encontrada = mascota;
				}
			}
		}
		return encontrada;
	}

	@Override
	public boolean add(Mascota x) {
		if(find(x)== null) {
			datos.add(x);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Mascota x, Mascota y) {
		Mascota e = find(x);
		if(e != null) {
			datos.remove(e);
			e.setEdad(y.getEdad());
			e.setNombre(y.getNombre());
			e.setTipo(y.getTipo());
			datos.add(e);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Mascota x) {
		Mascota e = find(x);
		if(e != null) {
			datos.remove(e);
			return true;
		}
		return false;
	}

}
