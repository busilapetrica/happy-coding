package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.PrintPatternPyramidIncreasingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintPattern_Pyramid_Increasing_NumberTest {
    @Test
    public void returnPatternPyramideWithNumberIncreasingWith4Rows() {
        String result = PrintPatternPyramidIncreasingNumber.consecutivePyramid(4);
        assertEquals("""
                                   1
                                  2 3
                                 4 5 6
                                7 8 9 10
                                """, result);
    }
}