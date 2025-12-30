package oop.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShapesTest {
    @Test
    void calculatesCircleMetrics() {
        Circle circle = new Circle(10);
        assertEquals(Math.PI * 25, circle.getArea());
        assertEquals(Math.PI * 10, circle.getPerimeter());
        assertEquals("Circle", circle.getName());
    }

    @Test
    void calculatesSquareMetrics() {
        Square square = new Square(5);
        assertEquals(25, square.getArea());
        assertEquals(20, square.getPerimeter());
        assertEquals("Square", square.getName());
    }

    @Test
    void calculatesTriangleMetrics() {
        Triangle triangle = new Triangle(6);
        assertEquals((Math.sqrt(3) / 4) * 36, triangle.getArea(), 1e-12);
        assertEquals(18, triangle.getPerimeter());
        assertEquals("Triangle", triangle.getName());
    }

    @Test
    void rejectsInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
        assertThrows(IllegalArgumentException.class, () -> new Square(-1));
        assertThrows(IllegalArgumentException.class, () -> new Triangle(0));
    }
}
