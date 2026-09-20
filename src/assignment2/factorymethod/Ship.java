package assignment2.factorymethod;

public final class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering cargo by sea.");
    }
}
