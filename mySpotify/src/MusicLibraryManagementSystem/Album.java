package MusicLibraryManagementSystem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Album implements retrieveSong{

    private final String title;
    private final int releaseYear;
    private final Artist artist;
    List<Song> songList;

    public Album(String title,int releaseYear, Artist artist) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        songList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }


    public Artist getArtist() {
        return artist;
    }

    public List<Song> getSongList() {
        return new ArrayList<>(songList);
    }

    public void addSong(Song song) {
        songList.add(song);
    }

    public int getTotalDuration(){
        int totalDuration = 0;

        for(Song song: songList){
            totalDuration += song.getDuration();
        }

        return totalDuration;
    }

    @Override
    public String getSongs() {
        StringBuilder sb = new StringBuilder();
        sb.append("Songs: \n");
        for(Song song: songList){
            sb.append(song.toString());
            sb.append("-----------");
        }
        return sb.toString();
    }

}
