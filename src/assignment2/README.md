# Assignment 2: Factory Method & Abstract Factory

## 1. What the products are

A Java implementation of two creational design patterns: Factory Method for transport and Abstract Factory for GUI components.

**Factory Method:** there is one Product interface (`Transport`) and two Concrete Products (`Truck` and `Ship`). The abstract Creator (`TransportFactory`) defines the factory method `createTransport()` and the shared delivery workflow `planDelivery()`. Concrete Creators decide which transport to instantiate.

**Abstract Factory:** there are two Abstract Products (`Button` and `Checkbox`) and two families of Concrete Products: Windows and Mac. Each Concrete Factory creates a complete family of components. The client (`Application`) works through the `GUIFactory`, `Button`, and `Checkbox` interfaces.

(Both examples are console simulations)

---

## 2. Project structure

```text
src/assignment2/
├── Main.java                      Entry point - demonstrates both patterns
├── factorymethod/
│   ├── Transport.java             Product interface
│   ├── Truck.java                 Concrete Product - road transport
│   ├── Ship.java                  Concrete Product - sea transport
│   ├── TransportFactory.java      Abstract Creator - shared delivery workflow
│   ├── RoadTransportFactory.java  Concrete Creator - creates Truck
│   └── SeaTransportFactory.java   Concrete Creator - creates Ship
└── abstractfactory/
    ├── Button.java                Abstract Product - button
    ├── Checkbox.java              Abstract Product - checkbox
    ├── WindowsButton.java         Concrete Product - Windows family
    ├── WindowsCheckbox.java       Concrete Product - Windows family
    ├── MacOSButton.java           Concrete Product - Mac family
    ├── MacOSCheckbox.java         Concrete Product - Mac family
    ├── GUIFactory.java            Abstract Factory interface
    ├── WindowsGUIFactory.java     Concrete Factory - Windows components
    ├── MacOSGUIFactory.java       Concrete Factory - Mac components
    └── Application.java           Client - uses abstract factory and products
```

---

## 3. How to create and use each product

**Factory Method — using the shared delivery workflow:**

```java
TransportFactory roadFactory = new RoadTransportFactory();
TransportFactory seaFactory = new SeaTransportFactory();

roadFactory.planDelivery();
seaFactory.planDelivery();
```

`planDelivery()` calls `createTransport()` and then `deliver()` on the returned product. The concrete creator determines whether the product is a `Truck` or a `Ship`.

**Abstract Factory — creating matching component families:**

```java
Application windowsApplication = new Application(new WindowsGUIFactory());
Application macOSApplication = new Application(new MacOSGUIFactory());

windowsApplication.render();
macOSApplication.render();
```

`Application` receives a factory through its constructor and uses it to create both a button and a checkbox. Each supplied factory produces components from its own family. Switching the factory changes the family without changing `Application`.

Factory methods return product interfaces (`Transport`, `Button`, and `Checkbox`). Action methods (`deliver()`, `planDelivery()`, and `render()`) return `void` because they perform actions rather than return data.

---

## 4. How to run it

Requires JDK 17+ and IntelliJ IDEA (recommended) or terminal

1. Open the project directory in IntelliJ IDEA.
2. Set Project SDK to Java 17 (`File` → `Project Structure` → `Project`).
3. Navigate to `src/assignment2/Main.java`.
4. Run via the green **Run** arrow or `Shift + F10`.
