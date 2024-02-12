package org.example;

import org.example.c02controlFlow.validate.C03_P36_Pattern_Increase_Decrease_Row;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P36_Pattern_Increase_Decrease_RowTest {
    @Test
    public void returnIncreaseAndDecreasePatternWith5Rows(){
        int rows = 5;
        String result = C03_P36_Pattern_Increase_Decrease_Row.patternIncreaseAndDecreaseNumbers(rows);
        assertEquals("""
                                1
                               121
                              12321
                             1234321
                            123454321
                                 """, result);
    }
}