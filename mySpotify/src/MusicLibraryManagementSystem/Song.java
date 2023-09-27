package MusicLibraryManagementSystem;

public class Song implements Playable, retrieveSong{
    private final String title;
    private final int duration;
    private final Artist artist;

    public Song(String title, int duration, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getSongs() {
        return "Song: \n" +
                "Title: " + title + '\n' +
                "Duration: " + duration + '\n' +
                "Artist: " + artist + '\n';
    }

    @Override
    public void play() {
        System.out.println(title + " is playing");
    }
}
