package co.edu.udistrital.model.persistence;

import java.util.ArrayList;

import co.edu.udistrital.model.Producto;

public class MapHandler {

	public static Producto convertirProductoDTOaProducto(ProductoDTO pDTO) {
		String nombre = pDTO.getNombre();
		int precio = pDTO.getPrecio();
		int cantidad = pDTO.getCantidad();
		int precioProduccion = pDTO.getPrecioProduccion();
		int precioVenta = pDTO.getPrecioVenta();
		Producto m = new Producto(nombre, precio, cantidad, precioProduccion, precioVenta);
		return m;
	}
	
	public static ProductoDTO convertirProductoaProductoDTO(Producto p) {
		ProductoDTO d = new ProductoDTO();
		d.setNombre(p.getNombre());
		d.setPrecio(p.getPrecio());
		d.setCantidad(p.getCantidad());
		d.setPrecioProduccion(p.getPrecioProduccion());
		d.setPrecioVenta(p.getPrecioVenta());
		return d;
	}
	
	public static ArrayList<Producto> convertirPanaderiaDTOaPanaderia(ArrayList<ProductoDTO> panaderiaDTO) {
		ArrayList<Producto> panaderia = new ArrayList<Producto>();
		for (ProductoDTO pDTO : panaderiaDTO) {
			Producto x = convertirProductoDTOaProducto(pDTO);
			panaderia.add(x);
		}
		return panaderia;
	}
	
	public static ArrayList<ProductoDTO> convertirProductoaProductoDTO(ArrayList<Producto> panaderia) {
		ArrayList<ProductoDTO> panaderiaDTO = new ArrayList<ProductoDTO>();
		for (Producto m : panaderia) {
			ProductoDTO x = convertirProductoaProductoDTO(m);
			panaderiaDTO.add(x);
		}
		return panaderiaDTO;
	}
	
}
