package co.edu.udistrital.model;

public class AdaptadorEnchufe implements EnchufeEuropeo {
    private EnchufeAmericano americano;

    public AdaptadorEnchufe(EnchufeAmericano americano) {
        this.americano = americano;
    }

    public void conectar220V() {
        System.out.println("Adaptando de 220V a 110V...");
        americano.conectar110V();
    }
}
