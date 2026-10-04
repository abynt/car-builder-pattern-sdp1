package assignment3.bridgepattern;

public class Square extends Shape {
    private final int side;

    public Square(Renderer renderer, int side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        renderer.drawLine(0, 0, side, 0);
        renderer.drawLine(side, 0, side, side);
        renderer.drawLine(side, side, 0, side);
        renderer.drawLine(0, side, 0, 0);
    }
}
