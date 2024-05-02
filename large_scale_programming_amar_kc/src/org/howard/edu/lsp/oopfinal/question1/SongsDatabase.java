package org.howard.edu.lsp.oopfinal.question1;
import java.util.*;

public class SongsDatabase {
    // HashMap to store genre as key and set of songs as value
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

    /* Add a song title to a genre */
    public void addSong(String genre, String songTitle) {
        // If the genre doesn't exist in the map, create a new entry
        if (!map.containsKey(genre)) {
            map.put(genre, new HashSet<String>());
        }
        // Add the song title to the set of songs for the genre
        map.get(genre).add(songTitle);
    }

    /* Return genre, i.e., jazz, given a song title */
    public String getGenreOfSong(String songTitle) {
        // Iterate through each entry in the map
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            // Check if the set of songs for the current genre contains the song title
            if (entry.getValue().contains(songTitle)) {
                // Return the genre if the song is found
                return entry.getKey();
            }
        }
        // Return null if the song title is not found in any genre
        return null;
    }

    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
        // Return the set of songs for the given genre, or an empty set if the genre doesn't exist
        return map.getOrDefault(genre, Collections.emptySet());
    }
}
