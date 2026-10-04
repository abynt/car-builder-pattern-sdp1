# Assignment 3: Bridge Pattern

## 1. About project

This project separates two questions:

- **What do we draw?** A Circle or a Square.
- **How do we draw it?** With a VectorRenderer or a RasterRenderer.

A shape holds a reference to a renderer. This connection is the bridge.
The same shape can switch between renderers while the program runs.

Renderer provides two basic operations: drawCircle() and drawLine().
Circle uses drawCircle(). Square draws its four sides using drawLine().

## 2. Project structure

| Bridge role           | Project class                  |
|-----------------------|--------------------------------|
| Abstraction           | Shape                          |
| Refined Abstractions  | Circle, Square                 |
| Implementor           | Renderer                       |
| Concrete Implementors | VectorRenderer, RasterRenderer |
| Client                | Main                           |

---

## 3. Runtime Demonstration

```java
Shape circle = new Circle(vector, 5);
circle.draw();
circle.setRenderer(raster);
circle.draw();
```

Main first draws both shapes with VectorRenderer, then switches the same objects
to RasterRenderer and draws them again. Their dimensions do not change.

Expected output:

```text
Vector: circle with radius 5
Vector: line from (0, 0) to (4, 0)
Vector: line from (4, 0) to (4, 4)
Vector: line from (4, 4) to (0, 4)
Vector: line from (0, 4) to (0, 0)

Raster: circle with radius 5
Raster: line from (0, 0) to (4, 0)
Raster: line from (4, 0) to (4, 4)
Raster: line from (4, 4) to (0, 4)
Raster: line from (0, 4) to (0, 0)
```
___

## 4. How to run it

Requires JDK 17+ and IntelliJ IDEA (recommended) or terminal

1. Open the project directory in IntelliJ IDEA.
2. Set Project SDK to Java 17 (`File` → `Project Structure` → `Project`).
3. Navigate to `src/assignment3/bridgepattern/Main.java`.
4. Run via the green **Run** arrow or `Shift + F10`.
