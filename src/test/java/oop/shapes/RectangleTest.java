package oop.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RectangleTest {
    @Test
    void rejectsInvalidInitialization() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(10, 0));
    }

    @Test
    void calculatesAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(10, rectangle.getWidth());
        assertEquals(5, rectangle.getHeight());
        assertEquals(30, rectangle.calculatePerimeter());
        assertEquals(50, rectangle.calculateArea());
    }

    @Test
    void updatesDimensionsWithValidation() {
        Rectangle rectangle = new Rectangle(10, 5);
        rectangle.setWidth(15);
        rectangle.setHeight(10);
        assertEquals(15, rectangle.getWidth());
        assertEquals(10, rectangle.getHeight());
        assertEquals(50, rectangle.calculatePerimeter());
        assertEquals(150, rectangle.calculateArea());
    }

    @Test
    void rejectsInvalidUpdates() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(25));
        assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(-3));
    }
}
