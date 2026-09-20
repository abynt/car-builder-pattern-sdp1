package assignment2.factorymethod;

public final class SeaTransportFactory extends TransportFactory {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
