package co.edu.udistrital.model;

import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.MascotaDTO;
import co.edu.udistrital.model.persistence.VeterinariaDAO;

public class Veterinaria {

private VeterinariaDAO veterinariaDAO;
	
	public Veterinaria() {
		veterinariaDAO = new VeterinariaDAO();
	}

	public VeterinariaDAO getVeterinariaDAO() {
		return veterinariaDAO;
	}

	public void setVeterinariaDAO(VeterinariaDAO veterinariaDAO) {
		this.veterinariaDAO = veterinariaDAO;
	}
	
	public boolean adicionarMascota(MascotaDTO mDTO) {
		Mascota x = MapHandler.convertirMascotaDTOaMascota(mDTO);
		return veterinariaDAO.add(x);
	}
	
	public boolean eliminarMascota(MascotaDTO mDTO) {
		Mascota x = MapHandler.convertirMascotaDTOaMascota(mDTO);
		return veterinariaDAO.delete(x);
	}
	
	public boolean actualizarMascota(MascotaDTO mDTO, MascotaDTO nDTO) {
		Mascota x = MapHandler.convertirMascotaDTOaMascota(mDTO);
		Mascota y = MapHandler.convertirMascotaDTOaMascota(nDTO);
		return veterinariaDAO.update(x, y);
	}
	
	public String obtenerListaClientes() {
		return veterinariaDAO.getAll();
	}
	
	public void actualizarBD() {
		veterinariaDAO.actualizarBD();
	}
}
