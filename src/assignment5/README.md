# Assignment 5 – Strategy Pattern (Calculator)

A simple Java 17 calculator that demonstrates the **Strategy** behavioral design pattern.
`Calculator` (Context) delegates the arithmetic operation to an `OperationStrategy`.
The client (`Main`) can switch the strategy at runtime without any `if`/`switch` in the context.

## Pattern roles

| Role               | Class                                                                   |
|--------------------|-------------------------------------------------------------------------|
| Strategy           | `OperationStrategy`                                                     |
| Concrete Strategies| `AddStrategy`, `SubtractStrategy`, `MultiplyStrategy`, `DivideStrategy` |
| Context            | `Calculator`                                                            |
| Client             | `Main`                                                                  |

## Project structure

```text
src/
  assignment5/
    strategy/
        OperationStrategy.java
        AddStrategy.java
        SubtractStrategy.java
        MultiplyStrategy.java
        DivideStrategy.java
        Calculator.java
        Main.java
    README.md
```

## How to run

Open the project in IntelliJ IDEA (JDK 17) and run `Main`.

Or from the terminal:

```bash
javac -d out $(find src -name "*.java")
java -cp out assignment5.strategy.Main
```

## Expected output

```text
12,0 + 5,0 = 17,0
12,0 - 5,0 = 7,0
12,0 * 5,0 = 60,0
12,0 / 5,0 = 2,4
```

## Adding a new operation

Create a new class that implements `OperationStrategy` and pass it to the calculator:

```java
calculator.setStrategy(new PowerStrategy());
```

`Calculator` and the existing strategies stay unchanged (Open/Closed Principle).