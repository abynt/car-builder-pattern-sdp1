package assignment2.abstractfactory;

import java.util.Objects;

public final class Application {
    private final Button button;
    private final Checkbox checkbox;


    public Application(GUIFactory factory) {
        Objects.requireNonNull(factory, "GUI factory must not be null");
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
