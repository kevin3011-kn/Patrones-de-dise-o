package model;

public class CursivaDecorator extends MensajeDecorator {
    public CursivaDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    public String obtenerTexto() {
        return "<i>" + mensaje.obtenerTexto() + "</i>";
    }
}