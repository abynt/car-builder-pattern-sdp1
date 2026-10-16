package assignment4.subsystem;

import java.util.Set;

public class MediaPlayer {
    private final Set<String> library = Set.of("Interstellar", "Avengers: Endgame", "Spider-Man", "The Social Network");
    private String loadedMovie;
    private boolean playing;

    public void load(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Movie title must not be blank.");
        }
        if (playing) {
            throw new IllegalStateException("Stop playback before loading another movie.");
        }
        if (!library.contains(title)) {
            throw new IllegalArgumentException("Movie is not in the library: " + title);
        }
        loadedMovie = title;
    }

    public void play() {
        if (!isLoaded()) {
            throw new IllegalStateException("Load a movie before playback.");
        }
        playing = true;
    }

    public void stop() { playing = false; }

    public void eject() {
        if (playing) {
            throw new IllegalStateException("Stop playback before ejecting.");
        }
        loadedMovie = null;
    }

    public boolean isLoaded() { return loadedMovie != null; }
    public boolean isPlaying() { return playing; }
    public String currentMovie() { return loadedMovie; }
}
