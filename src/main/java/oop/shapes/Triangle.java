package oop.shapes;

class Triangle extends Shape {
    private double sideLength;
    public Triangle(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        this.sideLength = sideLength;
    }
    @Override
    double getArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }
    @Override
    double getPerimeter() {
        return 3 * sideLength;
    }
    @Override
    String getName() {
        return "Triangle";
    }
}
