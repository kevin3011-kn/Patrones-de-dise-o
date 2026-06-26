package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Music;

public class ClassicalMusic extends Music {
    public ClassicalMusic() {
        this.title  = "Symphony No.5";
        this.artist = "Ludwig van Beethoven";
    }

    @Override
    public String getDescription() {
        return String.format("Classical: \"%s\" by %s", title, artist);
    }
}