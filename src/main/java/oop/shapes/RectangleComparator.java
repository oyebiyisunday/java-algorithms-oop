package oop.shapes;

import java.util.Comparator;
public class RectangleComparator implements Comparator<Rectangle> {
    @Override
public int compare(Rectangle r1, Rectangle r2) {
//To compare the two rectangle areas
return Double.compare(r1.calculateArea(), r2.calculateArea());
    }
}