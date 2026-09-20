package assignment2.abstractfactory;

public final class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("Rendering MacOS button.");
    }
}
