package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P33_Display_Pascals_TriangleTest {
    @Test
    public void returnPascalsTrianglePatternWith5Rows(){
        int rows = 5;
        String result = C03_P33_Display_Pascals_Triangle.pascalsTriangle(rows);
        assertEquals("""
                    1 \s
                   1  1 \s
                  1  2  1 \s
                 1  3  3  1 \s
                1  4  6  4  1 \s
                                 """, result);
    }

}