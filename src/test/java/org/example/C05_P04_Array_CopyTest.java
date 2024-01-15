package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class C05_P04_Array_CopyTest {
    @Test
    public void copyNumbersToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertEquals("[1, 1, 5, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(result));

    }

    @Test
    public void copy3NumbersToCommaSpaceSeparatedList() {
        int[] array = {33, 42, 51}; // Initial array
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertEquals("[33, 42, 51]", Arrays.toString(result));
    }

    @Test
    public void copy2NumbersToCommaSpaceSeparatedList() {
        int[] array = {3, 4}; // Initial array
        int[] result = C05_P04_Array_Copy.copyToSecondArray(array);
        // Assert result
        assertEquals("[3, 4]", Arrays.toString(result));
    }


}