package co.edu.udistrital.model;

public class ControlBasico extends ControlRemoto {
    public ControlBasico(Dispositivo d) {
        super(d);
    }

    public void activar() {
        dispositivo.encender();
    }

    public void desactivar() {
        dispositivo.apagar();
    }
}