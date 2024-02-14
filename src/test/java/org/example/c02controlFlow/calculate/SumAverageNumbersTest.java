package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.SumAverageNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAverageNumbersTest {
    @Test
    void returnSumNumbers() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = SumAverageNumbers.calculateSum(array);
        assertEquals(54, result);
    }

    @Test
    void returnAverageNumbers() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = SumAverageNumbers.calculateAverage(array);
        assertEquals(5.4, result);
    }

}