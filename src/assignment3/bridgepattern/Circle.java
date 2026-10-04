package assignment3.bridgepattern;

public class Circle extends Shape {
    private final int radius;

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.drawCircle(radius);
    }
}
