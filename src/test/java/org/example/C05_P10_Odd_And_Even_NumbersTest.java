package org.example;

import org.example.c03arrays.search.C05_P10_Odd_And_Even_Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P10_Odd_And_Even_NumbersTest {
    @Test
    public void findOddAndEvenInArrayWith3Elements() {
        int[] array = {1, 3, 2}; // Initial array
        int[][] result = C05_P10_Odd_And_Even_Numbers.separateOddAndEvenNumbers(array);
        assertArrayEquals(new int[]{2}, result[0]);
        assertArrayEquals(new int[]{1,3}, result[1]);
    }
    @Test
    public void findOddAndEvenInArrayWith10Elements() {
        int[] array = {1, 3, 2, 6, 8, 9, 0, 33, 43, 32}; // Initial array
        int[][] result = C05_P10_Odd_And_Even_Numbers.separateOddAndEvenNumbers(array);
        assertArrayEquals(new int[]{2, 6, 8, 0, 32}, result[0]);
        assertArrayEquals(new int[]{1, 3, 9, 33, 43}, result[1]);
    }
}