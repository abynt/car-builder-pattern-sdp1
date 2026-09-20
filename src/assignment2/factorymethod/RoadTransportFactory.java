package assignment2.factorymethod;

public final class RoadTransportFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
