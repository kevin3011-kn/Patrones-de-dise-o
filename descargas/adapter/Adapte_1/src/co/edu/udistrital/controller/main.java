package co.edu.udistrital.controller;

import co.edu.udistrital.model.AdaptadorEnchufe;
import co.edu.udistrital.model.EnchufeAmericano;
import co.edu.udistrital.view.VistaEnchufe;

public class main {
	public static void main(String[] args) {
		
        EnchufeAmericano americano = new EnchufeAmericano();
        AdaptadorEnchufe adaptado = new AdaptadorEnchufe(americano);
        VistaEnchufe vista = new VistaEnchufe();
        ControladorEnchufe controlador = new ControladorEnchufe(adaptado, vista);
        controlador.conectar();
       
        
}
}