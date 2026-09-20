package assignment2.factorymethod;

public abstract class TransportFactory {
    public abstract Transport createTransport();

    public final void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
