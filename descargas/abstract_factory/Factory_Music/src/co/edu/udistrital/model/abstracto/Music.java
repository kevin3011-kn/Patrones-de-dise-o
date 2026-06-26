package co.edu.udistrital.model.abstracto;

public abstract class Music {
    protected String title;
    protected String artist;

    public abstract String getDescription();

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}