package assignment3.bridgepattern;

public class VectorRenderer implements Renderer {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Vector: circle with radius " + radius);
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Vector: line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }
}
