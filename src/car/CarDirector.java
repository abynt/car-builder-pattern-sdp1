package car;

public class CarDirector {

    public Car makeSportsCar(CarBuilder builder) {
        return builder.reset()
                .setSeats(2)
                .setEngine(EngineType.SPORT)
                .setGPS(true)
                .setTripComputer(true)
                .build();
    }

    public Car makeFamilyCar(CarBuilder builder) {
        return builder.reset()
                .setSeats(7)
                .setEngine(EngineType.DIESEL)
                .setGPS(false)
                .setTripComputer(false)
                .build();
    }
}
