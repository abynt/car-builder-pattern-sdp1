package car;

public interface CarBuilder {
    CarBuilder reset();
    CarBuilder setSeats(int seats);
    CarBuilder setEngine(EngineType engine);
    CarBuilder setGPS(boolean gps);
    CarBuilder setTripComputer(boolean tripComputer);
    Car build();
}
