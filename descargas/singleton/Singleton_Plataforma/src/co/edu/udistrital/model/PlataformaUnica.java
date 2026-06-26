package co.edu.udistrital.model;


public class PlataformaUnica {

	private static PlataformaUnica instancia = null;
	private String PruebaInstancia = null;

	private PlataformaUnica() {

	}

	public static PlataformaUnica getinstancia() {

		if (instancia == null) {
			instancia = new PlataformaUnica();
		}
		return instancia;
	}

	public void direccion(String dire) {
		System.out.println(dire);
	}

	public void setPruebaInstancia(String salida) {
		PruebaInstancia = salida;
	}

	public String getPruebaInstancia() {
		return PruebaInstancia;
	}
}
