package oop.shapes;

class Square extends Shape {
    private double sideLength;
    public Square(double sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0");
        }
        this.sideLength = sideLength;
    }
    @Override
    double getArea() {
        return sideLength * sideLength;
    }
    @Override
    double getPerimeter() {
        return 4 * sideLength;
    }
    @Override
    String getName() {
        return "Square";
    }
}
