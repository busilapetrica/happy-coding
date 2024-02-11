package org.example.c03arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.transform.C05_P04_Array_Copy;
import org.junit.jupiter.api.Test;

class C05_P04_Array_CopyTest {
    @Test
    public void copyNumbersToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{1, 1, 5, 3, 4, 5, 6, 7, 8, 9}, result);

    }

    @Test
    public void copy3NumbersToCommaSpaceSeparatedList() {
        int[] array = {33, 42, 51}; // Initial array
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{33, 42, 51},result);
    }

    @Test
    public void copy2NumbersToCommaSpaceSeparatedList() {
        int[] array = {3, 4}; // Initial array
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{3, 4}, result);
    }


}