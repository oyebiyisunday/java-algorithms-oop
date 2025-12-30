package oop.shapes;

// Shape abstract class
abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
    String getName() {
        return "Shape";
    }
}
