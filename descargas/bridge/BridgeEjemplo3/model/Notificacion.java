package model;

public abstract class Notificacion {
    protected Enviador enviador;

    public Notificacion(Enviador enviador) {
        this.enviador = enviador;
    }

    public abstract void notificar(String mensaje);
}
