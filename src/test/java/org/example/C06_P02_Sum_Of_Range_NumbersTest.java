package org.example;

import org.example.c05recursion.C06_P02_Sum_Of_Range_Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C06_P02_Sum_Of_Range_NumbersTest {
    @Test
    public void returnSum15ofRangeFrom1To5() {
        int endNumber = 5;
        int result = C06_P02_Sum_Of_Range_Numbers.sumOfRange(endNumber);
        assertEquals(15, result);
    }

    @Test
    public void returnSum1ofRangeIfNumberStartsAndEndWith1() {
        int endNumber = 1;
        int result = C06_P02_Sum_Of_Range_Numbers.sumOfRange(endNumber);
        assertEquals(1, result);
    }
}