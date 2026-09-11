package car;

public class SportsCarBuilder implements CarBuilder {
    private static final int MAX_SPORTS_CAR_SEATS = 4;

    private int seats;
    private EngineType engine;
    private boolean hasGPS;
    private boolean hasTripComputer;

    @Override
    public CarBuilder reset() {
        seats = 0;
        engine = null;
        hasGPS = false;
        hasTripComputer = false;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(EngineType engine) {
        this.engine = (engine == EngineType.DIESEL) ? EngineType.SPORT : engine;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean gps) {
        this.hasGPS = gps;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(boolean tripComputer) {
        this.hasTripComputer = tripComputer;
        return this;
    }

    @Override
    public Car build() {
        validate();
        return new Car(seats, engine, hasGPS, hasTripComputer);
    }

    private void validate() {
        if (seats <= 0 || seats > MAX_SPORTS_CAR_SEATS) {
            throw new IllegalArgumentException("A sports car must have between 1 and " + MAX_SPORTS_CAR_SEATS + " seats.");
        }
        if (engine == null) {
            throw new IllegalArgumentException("Engine type must be set!");
        }
    }
}
