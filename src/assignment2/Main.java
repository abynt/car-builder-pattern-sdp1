package assignment2;

import assignment2.factorymethod.RoadTransportFactory;
import assignment2.factorymethod.SeaTransportFactory;
import assignment2.factorymethod.TransportFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("= Factory Method =");
        TransportFactory roadFactory = new RoadTransportFactory();
        TransportFactory seaFactory = new SeaTransportFactory();
        roadFactory.planDelivery();
        seaFactory.planDelivery();
    }
}
