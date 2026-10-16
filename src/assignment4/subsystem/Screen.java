package assignment4.subsystem;

public class Screen {
    private boolean lowered;
    public void lower() { lowered = true; }
    public void raise() { lowered = false; }
    public boolean isLowered() { return lowered; }
}
