package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P05_Rectangle_PerimeterTest {
    @Test
    public void returnPerimeterOfRectangle(){
        int result = C01_P05_Rectangle_Perimeter.calculatePerimeterOfRectangle(7,5);
        assertEquals(24, result);
    }

}