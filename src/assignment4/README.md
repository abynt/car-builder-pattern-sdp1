# Assignment 4: Facade Pattern

## 1. About project

This project simulates a home theater with five devices:
a MediaPlayer, an Amplifier, a Projector, a Screen and Lights.

Starting a movie requires several steps: loading the movie, lowering the screen,
connecting the projector and amplifier, setting the volume, dimming the room lights
and starting playback.

HomeTheaterFacade performs these steps through one method: watchMovie().
The endMovie() method stops playback and returns the devices to their normal state.

The client uses only the facade. Subsystem classes do not know about the facade
and can also be used directly by other clients.

This is an in-memory simulation, not a real video player.

## 2. Project structure

| Facade role       | Project class                                     |
|-------------------|---------------------------------------------------|
| Facade            | HomeTheaterFacade                                 |
| Subsystem classes | MediaPlayer, Amplifier, Projector, Screen, Lights |
| Client            | Client                                            |

MediaPlayer manages movies and playback. Amplifier uses the player as its audio
source. Projector uses the player and screen to check whether an image can be shown.
Screen stores its position, and Lights controls room brightness.

The facade can create its own devices or receive them through a constructor.

---

## 3. Runtime Demonstration

```java
HomeTheaterFacade theater = new HomeTheaterFacade();

System.out.println("Before: " + theater.status());
theater.watchMovie("Spider-Man");
System.out.println("During: " + theater.status());
theater.endMovie();
System.out.println("After: " + theater.status());
```

Client starts a movie through the facade, prints its status and ends the session.
The actual Client also handles invalid input and calls endMovie() in a finally block.

Expected output:

```text
Before: Idle
During: Playing: Spider-Man
After: Idle
```

Available movies: Interstellar, Avengers: Endgame, Spider-Man and The Social Network. Titles are case-sensitive.
An unknown title is rejected before the room settings change.

## 4. How to run it

Requires JDK 17+ and IntelliJ IDEA (recommended) or terminal

1. Open the project directory in IntelliJ IDEA.
2. Set Project SDK to Java 17 (`File` → `Project Structure` → `Project`).
3. Navigate to `src/assignment4/Client.java`.
4. Run via the green **Run** arrow or `Shift + F10`.