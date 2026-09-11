package car;

public class Car {
    private final int seats;
    private final EngineType engine;
    private final boolean hasGPS;
    private final boolean hasTripComputer;

    Car(int seats, EngineType engine, boolean hasGPS, boolean hasTripComputer) {
        this.seats = seats;
        this.engine = engine;
        this.hasGPS = hasGPS;
        this.hasTripComputer = hasTripComputer;
    }

    public int getSeats() {
        return seats;
    }

    public EngineType getEngine() {
        return engine;
    }

    public boolean hasGPS() {
        return hasGPS;
    }

    public boolean hasTripComputer() {
        return hasTripComputer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", hasGPS=" + hasGPS +
                ", hasTripComputer=" + hasTripComputer +
                '}';
    }
}
