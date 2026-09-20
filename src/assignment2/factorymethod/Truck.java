package assignment2.factorymethod;

public final class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering cargo by road.");
    }
}
