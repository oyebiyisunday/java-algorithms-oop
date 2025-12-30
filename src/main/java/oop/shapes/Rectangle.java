package oop.shapes;

public class Rectangle {
private double width;
private double height;
// Constructor
public Rectangle(double width, double height) {
if (width <= 0.0 || width > 20.0 || height <= 0.0 || height > 20.0) {
throw new IllegalArgumentException("Both width and height must be greater than 0.0 and less than or equal to 20.0");
        }
        this.width = width;
        this.height = height;
    }
// Accessor methods
public double getWidth() {
return width;
    }
// Mutator methods with validation
public void setWidth(double width) {
if (width <= 0.0 || width > 20.0) {
throw new IllegalArgumentException("Width must be greater than 0.0 and less than or equal to 20.0");
        }
        this.width = width;
    }
public double getHeight() {
return height;
    }
public void setHeight(double height) {
if (height <= 0.0 || height > 20.0) {
throw new IllegalArgumentException("Height must be greater than 0.0 and less than or equal to 20.0");
        }
        this.height = height;
    }
// Method to compute perimeter
public double calculatePerimeter() {
return 2 * (width + height);
    }
// Method to compute area
public double calculateArea() {
return width * height;
    }
}// Paste your Rectangle code here.
