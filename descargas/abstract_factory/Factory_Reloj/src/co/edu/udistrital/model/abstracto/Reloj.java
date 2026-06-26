package co.edu.udistrital.model.abstracto;

public abstract class Reloj {
    protected String hora;

    public abstract String mostrarHora();

    public String getHora() {
        return hora;
    }
}
