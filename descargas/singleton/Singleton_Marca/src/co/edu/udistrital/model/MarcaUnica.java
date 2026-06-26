package co.edu.udistrital.model;


public class MarcaUnica {

	private static MarcaUnica instancia = null;
	private String PruebaInstancia = null;

	private MarcaUnica() {

	}

	public static MarcaUnica getinstancia() {

		if (instancia == null) {
			instancia = new MarcaUnica();
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
