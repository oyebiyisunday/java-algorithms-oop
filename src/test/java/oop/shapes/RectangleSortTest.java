package oop.shapes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleSortTest {
    @Test
    void sortsRectanglesByAreaAscending() {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(5.0, 8.0));
        rectangles.add(new Rectangle(3.0, 4.0));
        rectangles.add(new Rectangle(7.0, 2.0));
        rectangles.add(new Rectangle(6.0, 6.0));
        rectangles.add(new Rectangle(4.0, 5.0));

        Collections.sort(rectangles, new RectangleComparator());

        assertEquals(12.0, rectangles.get(0).calculateArea());
        assertEquals(14.0, rectangles.get(1).calculateArea());
        assertEquals(20.0, rectangles.get(2).calculateArea());
        assertEquals(36.0, rectangles.get(3).calculateArea());
        assertEquals(40.0, rectangles.get(4).calculateArea());
    }
}
