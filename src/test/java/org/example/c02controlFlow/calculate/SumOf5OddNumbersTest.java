package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.SumOf5OddNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOf5OddNumbersTest {
    @Test
    void returnSumOfArrayWith5OddNumbers() {
        int[] array = new int[]{11, 17, 13, 12, 5};
        int result = SumOf5OddNumbers.calculateSumOddNumbers(array);
        assertEquals(46, result);
    }

}