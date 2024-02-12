package org.example;

import org.example.c02controlFlow.validate.C03_P12_Triangle_Increasing_Line;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P12_Triangle_Increasing_LineTest {
    @Test
    public void returnPatternTriangleWithNumberIncreasingWith4Rows() {
        String result = C03_P12_Triangle_Increasing_Line.patternTriangle(4);
        assertEquals("""
                                1
                                23
                                456
                                78910
                                """, result);
    }
}