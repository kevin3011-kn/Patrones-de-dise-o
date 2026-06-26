package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Music;


public class RockMusic extends Music {
    public RockMusic() {
        this.title  = "Bohemian Rhapsody";
        this.artist = "Queen";
    }

    @Override
    public String getDescription() {
        return String.format("Rock: \"%s\" by %s", title, artist);
    }
}