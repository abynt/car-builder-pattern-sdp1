package assignment4.facade;

import java.util.Objects;
import assignment4.subsystem.Amplifier;
import assignment4.subsystem.Lights;
import assignment4.subsystem.MediaPlayer;
import assignment4.subsystem.Projector;
import assignment4.subsystem.Screen;

public class HomeTheaterFacade {
    private static final int MOVIE_VOLUME = 35;
    private static final int MOVIE_BRIGHTNESS = 15;
    private static final int NORMAL_BRIGHTNESS = 100;

    private final MediaPlayer player;
    private final Amplifier amplifier;
    private final Projector projector;
    private final Screen screen;
    private final Lights lights;

    public HomeTheaterFacade() {
        this(new MediaPlayer(), new Amplifier(), new Projector(), new Screen(), new Lights());
    }

    public HomeTheaterFacade(MediaPlayer player, Amplifier amplifier, Projector projector,
                             Screen screen, Lights lights) {
        this.player = Objects.requireNonNull(player, "player must not be null");
        this.amplifier = Objects.requireNonNull(amplifier, "amplifier must not be null");
        this.projector = Objects.requireNonNull(projector, "projector must not be null");
        this.screen = Objects.requireNonNull(screen, "screen must not be null");
        this.lights = Objects.requireNonNull(lights, "lights must not be null");
    }

    public void watchMovie(String title) {
        if (player.isPlaying()) {
            throw new IllegalStateException("End the current movie first.");
        }

        player.load(title);
        try {
            screen.lower();
            projector.project(player, screen);
            amplifier.connect(player);
            amplifier.setVolume(MOVIE_VOLUME);
            lights.setBrightness(MOVIE_BRIGHTNESS);
            player.play();
        } catch (RuntimeException error) {
            endMovie();
            throw error;
        }
    }

    public void endMovie() {
        player.stop();
        amplifier.disconnect();
        projector.disconnect();
        player.eject();
        screen.raise();
        lights.setBrightness(NORMAL_BRIGHTNESS);
    }

    public String status() {
        if (player.isPlaying()) {
            return "Playing: " + player.currentMovie();
        }
        return "Idle";
    }
}

