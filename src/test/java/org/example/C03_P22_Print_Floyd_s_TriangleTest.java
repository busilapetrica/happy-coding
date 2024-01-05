package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C03_P22_Print_Floyd_s_TriangleTest {

    @Test
    public void floydTriangleWithHeight1(){
        int height = 1;
        String floydTriangle = C03_P22_Print_Floyd_s_Triangle.getFloydTriangle(height);
        assertEquals("1", floydTriangle);
    }

    @Test
    public void floydTriangleWithHeight3(){
        int height = 3;
        String floydTriangle = C03_P22_Print_Floyd_s_Triangle.getFloydTriangle(height);
        assertEquals("""
                1
                01
                101""", floydTriangle);
    }
}
