package co.edu.udistrital.model;

import co.edu.udistrital.model.abstracto.Music;

public class PopMusic extends Music {
    public PopMusic() {
        this.title  = "Billie Jean";
        this.artist = "Michael Jackson";
    }

    @Override
    public String getDescription() {
        return String.format("Pop: \"%s\" by %s", title, artist);
    }
}
