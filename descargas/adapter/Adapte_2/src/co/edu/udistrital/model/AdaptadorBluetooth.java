package co.edu.udistrital.model;

public class AdaptadorBluetooth implements ReproductorBluetooth {
    private ReproductorJack jack;

    public AdaptadorBluetooth(ReproductorJack jack) {
        this.jack = jack;
    }

    public void conectarBluetooth() {
        System.out.println("Convirtiendo señal a Bluetooth...");
        jack.conectarJack();
    }
}
