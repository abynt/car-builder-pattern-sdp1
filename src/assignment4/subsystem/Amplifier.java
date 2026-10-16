package assignment4.subsystem;

import java.util.Objects;

public class Amplifier {
    private MediaPlayer source;
    private int volume;

    public void connect(MediaPlayer player) {
        Objects.requireNonNull(player, "Audio source must not be null.");
        if (!player.isLoaded()) {
            throw new IllegalStateException("Audio source must contain a movie.");
        }
        source = player;
    }

    public void setVolume(int level) {
        if (level < 0 || level > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100.");
        }
        if (source == null) {
            throw new IllegalStateException("Connect an audio source first.");
        }
        volume = level;
    }

    public boolean isAudible() {
        return source != null && source.isPlaying() && volume > 0;
    }

    public boolean isConnected() { return source != null; }
    public int volume() { return volume; }
    public void disconnect() { volume = 0; source = null; }
}
