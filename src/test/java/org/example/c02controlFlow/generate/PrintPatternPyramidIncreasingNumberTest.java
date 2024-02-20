package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintPatternPyramidIncreasingNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintPatternPyramidIncreasingNumberTest {
    @Test
    void returnPatternPyramidWithNumberIncreasingWith4Rows() {
        String result = PrintPatternPyramidIncreasingNumber.consecutivePyramid(4);
        assertEquals("""
                   1
                  2 3
                 4 5 6
                7 8 9 10
                """, result);
    }
}