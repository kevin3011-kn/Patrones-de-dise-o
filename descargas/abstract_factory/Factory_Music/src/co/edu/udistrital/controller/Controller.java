package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.*;
import co.edu.udistrital.model.concretoCreador.*;
import co.edu.udistrital.view.VistaConsola;

public class Controller {

	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	MusicFactory rockFactory = new RockMusicFactory();
        Music rock = rockFactory.createMusic();
        vista.mostrarInformacion(rock.getDescription());

        MusicFactory classicalFactory = new ClassicalMusicFactory();
        Music classical = classicalFactory.createMusic();
        vista.mostrarInformacion(classical.getDescription());

        MusicFactory popFactory = new PopMusicFactory();
        Music pop = popFactory.createMusic();
        vista.mostrarInformacion(pop.getDescription());
    
    }
    
}
