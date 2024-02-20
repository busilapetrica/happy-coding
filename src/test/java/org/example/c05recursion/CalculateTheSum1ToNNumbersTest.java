package org.example.c05recursion;

import org.example.c05recursion.CalculateTheSum1ToNNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTheSum1ToNNumbersTest {
    @Test
    void returnSum15ofRangeFrom1To5() {
        int endNumber = 5;
        int result = CalculateTheSum1ToNNumbers.sumOfRange(endNumber);
        assertEquals(15, result);
    }

    @Test
    void returnSum1ofRangeIfNumberStartsAndEndWith1() {
        int endNumber = 1;
        int result = CalculateTheSum1ToNNumbers.sumOfRange(endNumber);
        assertEquals(1, result);
    }
}