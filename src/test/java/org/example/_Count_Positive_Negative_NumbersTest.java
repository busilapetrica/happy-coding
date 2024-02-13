package org.example;

import org.example.c03arrays.search.CountPositiveNegativeNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Count_Positive_Negative_NumbersTest {
    @Test
     void returnSumOfArrayWith5OddNumbers() {
        int[] array = new int[]{5,-4,10,15,-1};
        String result = CountPositiveNegativeNumbers.countNumbersPositiveAndNegative(array);
        assertEquals("""
                Positive: 3
                Negative: 2
                """ , result);
    }
}