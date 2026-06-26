package Ejemplo;


	
	

	interface Bebida {
	    String descripcion();
	    double costo();
	}

	class Cafe implements Bebida {
	    public String descripcion() {
	        return "Café";
	    }

	    public double costo() {
	        return 1.0;
	    }
	}

	abstract class BebidaDecorator implements Bebida {
	    protected Bebida bebida;

	    public BebidaDecorator(Bebida bebida) {
	        this.bebida = bebida;
	    }
	}

	class ConLeche extends BebidaDecorator {
	    public ConLeche(Bebida bebida) {
	        super(bebida);
	    }

	    public String descripcion() {
	        return bebida.descripcion() + " con leche";
	    }

	    public double costo() {
	        return bebida.costo() + 0.5;
	    }
	}

	class ConAzucar extends BebidaDecorator {
	    public ConAzucar(Bebida bebida) {
	        super(bebida);
	    }

	    public String descripcion() {
	        return bebida.descripcion() + " con azúcar";
	    }

	    public double costo() {
	        return bebida.costo() + 0.2;
	    }
	}

	// Vista
	class VistaBebida {
	    public void mostrar(String desc, double precio) {
	        System.out.println(desc + " - Precio: $" + precio);
	    }
	}

	// Controlador
	class ControladorBebida {
	    private Bebida bebida;
	    private VistaBebida vista;

	    public ControladorBebida(Bebida bebida, VistaBebida vista) {
	        this.bebida = bebida;
	        this.vista = vista;
	    }

	    public void servir() {
	        vista.mostrar(bebida.descripcion(), bebida.costo());
	    }
	}

	public class Bebidas {
	    public static void main(String[] args) {
	        Bebida bebida = new Cafe();
	        bebida = new ConLeche(new ConAzucar(bebida));

	        VistaBebida vista = new VistaBebida();
	        ControladorBebida controlador = new ControladorBebida(bebida, vista);
	        controlador.servir();
	    }
	}



