package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.PrintPatternIncreaseDecreasePyramid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintPatternIncreaseDecreasePyramidTest {
    @Test
    void returnIncreaseAndDecreasePatternWith5Rows() {
        int rows = 5;
        String result = PrintPatternIncreaseDecreasePyramid.patternIncreaseAndDecreaseNumbers(rows);
        assertEquals("""
                    1
                   121
                  12321
                 1234321
                123454321
                     """, result);
    }
}