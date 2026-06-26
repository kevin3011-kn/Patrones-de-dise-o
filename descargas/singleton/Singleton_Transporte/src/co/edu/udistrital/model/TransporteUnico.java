package co.edu.udistrital.model;


public class TransporteUnico {

	private static TransporteUnico instancia = null;
	private String PruebaInstancia = null;

	private TransporteUnico() {

	}

	public static TransporteUnico getinstancia() {

		if (instancia == null) {
			instancia = new TransporteUnico();
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
