package co.edu.udistrital.model;


public class EdificioUnico {

	private static EdificioUnico instancia = null;
	private String PruebaInstancia = null;

	private EdificioUnico() {

	}

	public static EdificioUnico getinstancia() {

		if (instancia == null) {
			instancia = new EdificioUnico();
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
