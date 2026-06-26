package co.edu.udistrital.model;

import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.MascotaDTO;
import co.edu.udistrital.model.persistence.VeterinariaDAO;

public class Veterinaria {

	private VeterinariaDAO vDAO;
	
	public Veterinaria() {
		vDAO = new VeterinariaDAO();
	}

	public VeterinariaDAO getvDAO() {
		return vDAO;
	}

	public void setvDAO(VeterinariaDAO vDAO) {
		this.vDAO = vDAO;
	}
	
	public boolean adicionarMascota(MascotaDTO d) {
		Mascota m = MapHandler.convertirMascotaDTOaMascota(d);
		return vDAO.add(m);
	}
	
	public boolean borrarMascota(MascotaDTO nombre) {
	
		Mascota m = MapHandler.convertirMascotaDTOaMascota(nombre);
		
		return vDAO.delete(m);
		
	}
	
	public boolean actualizarMascota(MascotaDTO nombre, MascotaDTO nombre1) {
		
		Mascota m = MapHandler.convertirMascotaDTOaMascota(nombre);
		Mascota m1 = MapHandler.convertirMascotaDTOaMascota(nombre1);
		
		return vDAO.update(m , m1);
		
	}
	
	public String verTodasLasMascotas() {
		return vDAO.getAll();
	}
}
