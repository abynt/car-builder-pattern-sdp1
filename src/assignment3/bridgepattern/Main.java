package assignment3.bridgepattern;

public class Main {
    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape circle = new Circle(vector, 5);
        Shape square = new Square(vector, 4);

        circle.draw();
        square.draw();

        System.out.println();

        circle.setRenderer(raster);
        square.setRenderer(raster);

        circle.draw();
        square.draw();
    }
}
