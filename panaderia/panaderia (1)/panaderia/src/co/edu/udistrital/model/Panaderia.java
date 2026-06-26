package co.edu.udistrital.model;

import co.edu.udistrital.model.persistence.MapHandler;
import co.edu.udistrital.model.persistence.ProductoDTO;
import co.edu.udistrital.model.persistence.PanaderiaDAO;

public class Panaderia {
	
	private PanaderiaDAO panaderiaDAO;
	
	public Panaderia() {
		panaderiaDAO = new PanaderiaDAO();
	}

	public PanaderiaDAO getPanaderiaDAO() {
		return panaderiaDAO;
	}

	public void setPanaderiaDAO(PanaderiaDAO panaderiaDAO) {
		this.panaderiaDAO = panaderiaDAO;
	}
	
	public boolean adicionarProducto(ProductoDTO pDTO) {
		Producto x = MapHandler.convertirProductoDTOaProducto(pDTO);
		return panaderiaDAO.add(x);
	}
	
	public boolean eliminarProducto(ProductoDTO pDTO) {
		Producto x = MapHandler.convertirProductoDTOaProducto(pDTO);
		return panaderiaDAO.delete(x);
	}
	
	public boolean actualizarProducto(ProductoDTO pDTO, ProductoDTO qDTO) {
		Producto x = MapHandler.convertirProductoDTOaProducto(pDTO);
		Producto y = MapHandler.convertirProductoDTOaProducto(qDTO);
		return panaderiaDAO.update(x, y);
	}
	
	public String obtenerListaClientes() {
		return panaderiaDAO.getAll();
	}
	
	public void actualizarBD() {
		panaderiaDAO.actualizarBD();
	}

}
