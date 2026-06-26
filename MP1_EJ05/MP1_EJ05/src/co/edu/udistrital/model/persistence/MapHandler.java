package co.edu.udistrital.model.persistence;

import java.util.ArrayList;

import co.edu.udistrital.model.Mascota;

public class MapHandler {

	public static Mascota convertirMascotaDTOaMascota(MascotaDTO mDTO) {
		String nombre = mDTO.getNombre();
		String tipo = mDTO.getTipo();
		int edad = mDTO.getEdad();
		Mascota m = new Mascota(nombre, edad, tipo);
		return m;
	}
	
	public static MascotaDTO convertirMascotaaMascotaDTO(Mascota m) {
		MascotaDTO d = new MascotaDTO();
		d.setNombre(m.getNombre());
		d.setTipo(m.getTipo());
		d.setEdad(m.getEdad());
		return d;
	}
	
	public static ArrayList<Mascota> convertirVeterinariaDTOaVeterinaria(ArrayList<MascotaDTO> veterinariaDTO) {
		ArrayList<Mascota> veterinaria = new ArrayList<Mascota>();
		for (MascotaDTO mDTO : veterinariaDTO) {
			Mascota x = convertirMascotaDTOaMascota(mDTO);
			veterinaria.add(x);
		}
		return veterinaria;
	}
	
	public static ArrayList<MascotaDTO> convertirMascotaaMascotaDTO(ArrayList<Mascota> veterinaria) {
		ArrayList<MascotaDTO> veterinariaDTO = new ArrayList<MascotaDTO>();
		for (Mascota m : veterinaria) {
			MascotaDTO x = convertirMascotaaMascotaDTO(m);
			veterinariaDTO.add(x);
		}
		return veterinariaDTO;
	}
	
}
