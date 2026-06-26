package Ejemplo;

 // Ejemplo 1 - Control remoto con comandos

interface Comando {
    void ejecutar();
}

class Luz {
    public void encender() {
        System.out.println("💡 Luz encendida");
    }

    public void apagar() {
        System.out.println("💡 Luz apagada");
    }
}

class ComandoEncender implements Comando {
    private Luz luz;

    public ComandoEncender(Luz luz) {
        this.luz = luz;
    }

    public void ejecutar() {
        luz.encender();
    }
}

class ComandoApagar implements Comando {
    private Luz luz;

    public ComandoApagar(Luz luz) {
        this.luz = luz;
    }

    public void ejecutar() {
        luz.apagar();
    }
}

// Vista
class VistaControlRemoto {
    public void mostrar(String accion) {
        System.out.println("Acción: " + accion);
    }
}

// Controlador
class ControladorRemoto {
    private Comando encender;
    private Comando apagar;
    private VistaControlRemoto vista;

    public ControladorRemoto(Comando encender, Comando apagar, VistaControlRemoto vista) {
        this.encender = encender;
        this.apagar = apagar;
        this.vista = vista;
    }

    public void presionarEncender() {
        vista.mostrar("Encender luz");
        encender.ejecutar();
    }

    public void presionarApagar() {
        vista.mostrar("Apagar luz");
        apagar.ejecutar();
    }
}

public class CommandEjemplo1 {
    public static void main(String[] args) {
        Luz luz = new Luz();
        VistaControlRemoto vista = new VistaControlRemoto();
        ControladorRemoto controlador = new ControladorRemoto(
            new ComandoEncender(luz),
            new ComandoApagar(luz),
            vista
        );

        controlador.presionarEncender();
        controlador.presionarApagar();
    }
}

