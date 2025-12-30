package oop.shapes;

class Circle extends Shape {
    private double diameter;
    public Circle(double diameter) {
        if (diameter <= 0) {
            throw new IllegalArgumentException("Diameter must be greater than 0");
        }
        this.diameter = diameter;
    }
    @Override
    double getArea() {
        double radius = diameter / 2;
        return Math.PI * radius * radius;
    }
    @Override
    String getName() {
        return "Circle";
    }
    @Override
    double getPerimeter() {
        return Math.PI * diameter;
    }
}
