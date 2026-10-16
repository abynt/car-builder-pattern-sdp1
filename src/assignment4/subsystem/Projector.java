package assignment4.subsystem;

import java.util.Objects;

public class Projector {
    private MediaPlayer source;
    private Screen screen;

    public void project(MediaPlayer player, Screen target) {
        Objects.requireNonNull(player, "Video source must not be null.");
        Objects.requireNonNull(target, "Screen must not be null.");
        if (!player.isLoaded() || !target.isLowered()) {
            throw new IllegalStateException("Load media and lower the screen first.");
        }
        source = player;
        screen = target;
    }

    public boolean isShowing() {
        return source != null && source.isPlaying() && screen.isLowered();
    }

    public boolean isConnected() { return source != null; }
    public void disconnect() { source = null; screen = null; }
}
