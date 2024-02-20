package org.example.c03arrays.calculate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.calculate.CalculateSumOfArrayElements;
import org.junit.jupiter.api.Test;

class CalculateSumOfArrayElementsTest {
    @Test
    void calculateSumNumbersFromArrayWith2Numbers() {
        int[] array = {1, 1};
        int result = CalculateSumOfArrayElements.calculateArraySum(array);
        assertEquals(2, result);
    }

    @Test
    void calculateSumNumbersFromArrayWith3Numbers() {
        int[] array = {1, 10, 18};
        int result = CalculateSumOfArrayElements.calculateArraySum(array);
        assertEquals(29, result);
    }

    @Test
    void calculateSumNumbersFromArrayWith4Numbers() {
        int[] array = {1, 55, 694, 7};
        int result = CalculateSumOfArrayElements.calculateArraySum(array);
        assertEquals(757, result);
    }
}