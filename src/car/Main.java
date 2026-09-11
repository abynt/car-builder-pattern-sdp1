package car;

public class Main {
    public static void main(String[] args) {
        CarDirector director = new CarDirector();

        Car sportsCar = director.makeSportsCar(new SportsCarBuilder());
        System.out.println("Sports car: " + sportsCar);

        Car familyCar = director.makeFamilyCar(new FamilyCarBuilder());
        System.out.println("Family car: " + familyCar);

        Car custom = new SportsCarBuilder()
                .reset()
                .setSeats(2)
                .setEngine(EngineType.DIESEL)
                .setGPS(true)
                .setTripComputer(false)
                .build();
        System.out.println("Custom sports car: " + custom);

        try {
            new SportsCarBuilder()
                    .reset()
                    .setSeats(7)
                    .setEngine(EngineType.SPORT)
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Validation works as expected: " + e.getMessage());
        }
    }
}