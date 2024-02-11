package org.example;

import org.example.c01operators.RectanglePerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P05_Rectangle_PerimeterTest {
    @Test
    public void returnPerimeterOfRectangle(){
        int result = RectanglePerimeter.calculatePerimeterOfRectangle(7,5);
        assertEquals(24, result);
    }

}