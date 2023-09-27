package MusicLibraryManagementSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MusicLibraryManagementSystemTest {

    @Test
    public void testSongPlayback() {
        Artist artist = new Artist("John Smith", "1985-03-15", "Pop");
        Song song = new Song("Song Title", 240, artist);

        assertEquals(240, song.getDuration());

        // Uncomment the following line when the play() method is implemented
        song.play();
    }

    @Test
    public void testAlbumAndPlaylist() {
        Artist artist = new Artist("Emily Johnson", "1990-07-20", "Rock");
        Album album = new Album("Album Title", 2023, artist);
        Song song1 = new Song("Song 1", 180, artist);
        Song song2 = new Song("Song 2", 210, artist);

        album.addSong(song1);
        album.addSong(song2);

        assertEquals(2, album.getSongList().size());

        PlayList playlist = new PlayList("My Playlist");
        playlist.addPlayable(song1);
        playlist.addPlayable(song2);

        // Uncomment the following line when the play() method is implemented
        playlist.play();
    }

    @Test
    public void testArtistAndAlbum() {
        Artist artist = new Artist("Michael Brown", "1982-11-30", "Jazz");
        Album album1 = new Album("Album 1", 2020, artist);
        Album album2 = new Album("Album 2", 2022, artist);

        artist.addAlbum(album1);
        artist.addAlbum(album2);

        assertEquals(2, artist.getDiscography().size());
    }

    @Test
    public void testPlaylistPlay() {
        Artist artist = new Artist("Alicia Adams", "1995-05-10", "Pop");
        Song song1 = new Song("Song A", 200, artist);
        Song song2 = new Song("Song B", 180, artist);
        PlayList playlist = new PlayList("My Playlist");
        playlist.addPlayable(song1);
        playlist.addPlayable(song2);

        // Uncomment the following line when the play() method is implemented
        playlist.play();
    }

    @Test
    public void testArtistAlbumAndSong() {
        Artist artist = new Artist("Daniel Green", "1988-09-25", "Rock");
        Album album = new Album("Album X", 2021, artist);
        Song song = new Song("Song X", 250, artist);

        album.addSong(song);
        artist.addAlbum(album);

        assertEquals(1, artist.getDiscography().size());
        assertEquals(1, album.getSongList().size());
    }

    @Test
    public void testMultipleArtistsAndAlbums() {
        Artist artist1 = new Artist("Alice Turner", "1992-02-12", "Pop");
        Artist artist2 = new Artist("Bob Parker", "1987-06-30", "Rock");
        Album album1 = new Album("Pop Album", 2022, artist1);
        Album album2 = new Album("Rock Album", 2023, artist2);

        artist1.addAlbum(album1);
        artist2.addAlbum(album2);

        assertEquals(1, artist1.getDiscography().size());
        assertEquals(1, artist2.getDiscography().size());
    }

    @Test
    public void testAlbumDuration() {
        Artist artist = new Artist("Ella Davis", "1998-12-05", "Pop");
        Album album = new Album("Pop Hits", 2023, artist);
        Song song1 = new Song("Song P", 210, artist);
        Song song2 = new Song("Song Q", 180, artist);

        album.addSong(song1);
        album.addSong(song2);

        assertEquals(390, album.getTotalDuration());
    }
}
