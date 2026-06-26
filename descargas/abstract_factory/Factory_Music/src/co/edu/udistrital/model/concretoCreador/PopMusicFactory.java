package co.edu.udistrital.model.concretoCreador;

import co.edu.udistrital.model.*;
import co.edu.udistrital.model.abstracto.Music;
import co.edu.udistrital.model.abstracto.MusicFactory;


public class PopMusicFactory implements MusicFactory {
    @Override
    public Music createMusic() {
        return new PopMusic();
    }
}


