package assignment4.subsystem;

public class Lights {
    private int brightness = 100;

    public void setBrightness(int percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Brightness must be between 0 and 100.");
        }
        brightness = percentage;
    }

    public int brightness() { return brightness; }
}
