package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class PrintFloydsTriangleTest {

    @Test
     void floydTriangleWithHeight1(){
        int height = 1;
        String floydTriangle = PrintFloydsTriangle.getFloydTriangle(height);
        assertEquals("1", floydTriangle);
    }

    @Test
     void floydTriangleWithHeight3(){
        int height = 3;
        String floydTriangle = PrintFloydsTriangle.getFloydTriangle(height);
        assertEquals("""
                1
                01
                101""", floydTriangle);
    }
}
