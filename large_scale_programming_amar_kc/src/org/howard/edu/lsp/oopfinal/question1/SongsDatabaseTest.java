package org.howard.edu.lsp.oopfinal.question1;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Set;

public class SongsDatabaseTest {

    // Test case for the addSong method
    @Test
    public void testAddSong() {
        // Create a SongsDatabase instance
        SongsDatabase db = new SongsDatabase();
        // Add a song to the "Rap" genre
        db.addSong("Rap", "Savage");
        // Check if the song "Savage" is in the "Rap" genre
        assertTrue(db.getSongs("Rap").contains("Savage"));
    }

    // Test case for the getGenreOfSong method
    @Test
    public void testGetGenreOfSong() {
        // Create a SongsDatabase instance
        SongsDatabase db = new SongsDatabase();
        // Add a song to the "Rap" genre
        db.addSong("Rap", "Savage");
        // Check if the genre of the song "Savage" is "Rap"
        assertEquals("Rap", db.getGenreOfSong("Savage"));
    }

    // Test case for the getSongs method
    @Test
    public void testGetSongs() {
        // Create a SongsDatabase instance
        SongsDatabase db = new SongsDatabase();
        // Add songs to the "Rap" genre
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        // Get the set of songs for the "Rap" genre
        Set<String> rapSongs = db.getSongs("Rap");
        // Check if the set contains both "Savage" and "Gin and Juice"
        assertTrue(rapSongs.contains("Savage"));
        assertTrue(rapSongs.contains("Gin and Juice"));
    }
}
