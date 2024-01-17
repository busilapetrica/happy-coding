package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C05_P10_Odd_And_Even_NumbersTest {
    @Test
    public void findOddAndEvenInArrayWith3Elements() {
        int[] array = {1, 3, 2}; // Initial array
        int[][] result = C05_P10_Odd_And_Even_Numbers.separateOddAndEvenNumbers(array);
        assertEquals("[2]", Arrays.toString(result[0]));
        assertEquals("[1, 3]", Arrays.toString(result[1]));
    }
    @Test
    public void findOddAndEvenInArrayWith10Elements() {
        int[] array = {1, 3, 2, 6, 8, 9, 0, 33, 43, 32}; // Initial array
        int[][] result = C05_P10_Odd_And_Even_Numbers.separateOddAndEvenNumbers(array);
        assertEquals("[2, 6, 8, 0, 32]", Arrays.toString(result[0]));
        assertEquals("[1, 3, 9, 33, 43]", Arrays.toString(result[1]));
    }
}