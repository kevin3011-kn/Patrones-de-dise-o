package co.edu.udistrital.controller;

import co.edu.udistrital.model.ReproductorJack;
import co.edu.udistrital.view.VistaAudio;


public class main {
	public static void main(String[] args) {
		
		  	ReproductorJack jack = new ReproductorJack();
	        ReproductorBluetooth adaptador = new AdaptadorBluetooth(jack);
	        VistaAudio vista = new VistaAudio();
	        ControladorAudio controlador = new ControladorAudio(adaptador, vista);
	        controlador.reproducir();
       
        
}
}