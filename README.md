# Assignment 1: Builder Pattern (Car)

## 1. What the product is

A Java implementation of the Builder pattern for car configuration. 
There is a single Product type (`Car`), and two ConcreteBuilders.
Rather than relying on a constructor with a long list of parameters (a telescoping constructor), object assembly is broken into small, chainable steps, and the resulting Car is immutable once built.

---

## 2. Project structure

```
src/car/
├── EngineType.java       enum - no magic strings
├── Car.java              Product (immutable)
├── CarBuilder.java       Builder interface
├── SportsCarBuilder.java ConcreteBuilder #1 (own validation/business rules)
├── FamilyCarBuilder.java ConcreteBuilder #2 (own validation/business rules)
├── CarDirector.java      Director - reusable "recipes"
└── Main.java             Client - demo entry point
```

---

## 3. How to build each representation

**Using the Director (recommended, reusable configurations):**
```java
CarDirector director = new CarDirector();

Car sportsCar = director.makeSportsCar(new SportsCarBuilder());
Car familyCar = director.makeFamilyCar(new FamilyCarBuilder());
```

**Fully custom, fluent chaining (no Director needed):**
```java
Car custom = new SportsCarBuilder()
        .reset()
        .setSeats(2)
        .setEngine(EngineType.SPORT)
        .setGPS(true)
        .setTripComputer(false)
        .build();
```

___

## 4. How to run it

Requires JDK 17+ and IntelliJ IDEA (recommended) or terminal

1. Open the project directory in IntelliJ IDEA.
2. Set Project SDK to Java 17 (`File` → `Project Structure` → `Project`).
3. Navigate to `src/car/Main.java`.
4. Run via the green **Run** arrow or `Shift + F10`.
