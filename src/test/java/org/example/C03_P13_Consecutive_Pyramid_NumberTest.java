package org.example;

import org.example.c02controlFlow.validate.C03_P13_Consecutive_Pyramid_Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P13_Consecutive_Pyramid_NumberTest {
    @Test
    public void returnPatternPyramideWithNumberIncreasingWith4Rows() {
        String result = C03_P13_Consecutive_Pyramid_Number.consecutivePyramid(4);
        assertEquals("""
                                   1
                                  2 3
                                 4 5 6
                                7 8 9 10
                                """, result);
    }
}