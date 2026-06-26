package co.edu.udistrital.controller;



import co.edu.udistrital.model.ReproductorBluetooth;
import co.edu.udistrital.view.VistaAudio;


public class ControladorAudio {
    private ReproductorBluetooth adaptador;
    private VistaAudio vista;

    public ControladorAudio(ReproductorBluetooth adaptador, VistaAudio vista) {
        this.adaptador = adaptador;
        this.vista = vista;
    }

    public void reproducir() {
        vista.mostrarConexion();
        adaptador.conectarBluetooth();
    }
}