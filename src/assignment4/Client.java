package assignment4;

import assignment4.facade.HomeTheaterFacade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade theater = new HomeTheaterFacade();
        String movie = "Spider-Man";
        if (args.length > 0) {
            movie = args[0];
        }

        System.out.println("Before: " + theater.status());
        try {
            theater.watchMovie(movie);
            System.out.println("During: " + theater.status());
        } catch (IllegalArgumentException | IllegalStateException error) {
            System.out.println("Cannot watch movie: " + error.getMessage());
        } finally {
            theater.endMovie();
        }
        System.out.println("After: " + theater.status());
    }
}