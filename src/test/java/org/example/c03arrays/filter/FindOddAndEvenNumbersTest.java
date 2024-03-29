package org.example.c03arrays.filter;

import org.example.c03arrays.filter.FindOddAndEvenNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOddAndEvenNumbersTest {
    @Test
     void findOddAndEvenInArrayWith3Elements() {
        int[] array = {1, 3, 2}; // Initial array
        int[][] result = FindOddAndEvenNumbers.separateOddAndEvenNumbers(array);
        assertArrayEquals(new int[]{2}, result[0]);
        assertArrayEquals(new int[]{1,3}, result[1]);
    }
    @Test
     void findOddAndEvenInArrayWith10Elements() {
        int[] array = {1, 3, 2, 6, 8, 9, 0, 33, 43, 32}; // Initial array
        int[][] result = FindOddAndEvenNumbers.separateOddAndEvenNumbers(array);
        assertArrayEquals(new int[]{2, 6, 8, 0, 32}, result[0]);
        assertArrayEquals(new int[]{1, 3, 9, 33, 43}, result[1]);
    }
}