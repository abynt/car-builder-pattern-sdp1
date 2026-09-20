package assignment2.abstractfactory;

public final class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering Windows button.");
    }
}
