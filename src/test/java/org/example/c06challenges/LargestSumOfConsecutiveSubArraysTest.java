package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestSumOfConsecutiveSubArraysTest {
    @Test
    void returnMaximSumOfSubArrayWhereMaxSumIs25() {
        int[] array = {8, 3, 8, -5, 4, 3, -4, 3, 5};
        int result = LargestSumOfConsecutiveSubArrays.findMaxSumOfNumbersConsecutive(array);
        assertEquals(25, result);
    }

    @Test
    void returnMaximSumOfSubArrayWhereMaxSumIs30() {
        int[] array = {1, 2, 3, 4, -19, 6, 7, 8, 9};
        int result = LargestSumOfConsecutiveSubArrays.findMaxSumOfNumbersConsecutive(array);
        assertEquals(30, result);
    }
}