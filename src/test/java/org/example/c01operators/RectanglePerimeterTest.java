package org.example.c01operators;

import org.example.c01operators.RectanglePerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanglePerimeterTest {
    @Test
    void returnPerimeterOfRectangle() {
        int result = RectanglePerimeter.calculatePerimeterOfRectangle(7, 5);
        assertEquals(24, result);
    }

}