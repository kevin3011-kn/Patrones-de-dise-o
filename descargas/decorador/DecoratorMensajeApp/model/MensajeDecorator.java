package model;

public abstract class MensajeDecorator implements Mensaje {
    protected Mensaje mensaje;

    public MensajeDecorator(Mensaje mensaje) {
        this.mensaje = mensaje;
    }
}