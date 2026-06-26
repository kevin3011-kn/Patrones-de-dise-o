import controller.ControladorForma;
import model.Azul;
import model.Circulo;
import model.Color;
import model.Forma;
import view.VistaForma;

public class BridgeEjemplo2 {
    public static void main(String[] args) {
        Color azul = new Azul();
        Forma circulo = new Circulo(azul);
        VistaForma vista = new VistaForma();
        ControladorForma controlador = new ControladorForma(circulo, vista);

        controlador.mostrarForma();
    }
}
