package car;

public class FamilyCarBuilder implements CarBuilder {

    private static final int MAX_FAMILY_CAR_SEATS = 7;

    private int seats;
    private EngineType engine;

    @Override
    public CarBuilder reset() {
        seats = 0;
        engine = null;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(EngineType engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setGPS(boolean gps) {
        return this;
    }

    @Override
    public CarBuilder setTripComputer(boolean tripComputer) {
        return this;
    }

    @Override
    public Car build() {
        validate();
        return new Car(seats, engine, true, true);
    }

    private void validate() {
        if (seats <= 0 || seats > MAX_FAMILY_CAR_SEATS) {
            throw new IllegalStateException("A family car must have between 1 and " + MAX_FAMILY_CAR_SEATS + " seats.");
        }
        if (engine == null) {
            throw new IllegalStateException("Engine type must be set!");
        }
    }
}
