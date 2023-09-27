package MusicLibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Artist {

    private final String name;

    private final String dateOfBirth;

    private final String genre;

    List<Album> discography;

    Artist(String name, String dateOfBirth, String genre){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.genre = genre;
        discography = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGenre() {
        return genre;
    }

    public List<Album> getDiscography() {
        return new ArrayList<>(discography);
    }

    public void addAlbum(Album album){
        discography.add(album);
    }


}
