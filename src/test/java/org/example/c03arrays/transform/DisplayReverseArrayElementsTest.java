 package org.example.c03arrays.transform;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.transform.DisplayReverseArrayElements;
import org.junit.jupiter.api.Test;

    class DisplayReverseArrayElementsTest {
        @Test
         void convertNumbersToCommaSeparatedListReversed() {
            int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Initial array
            // Call logic
            int[] result = DisplayReverseArrayElements.arrayToStringRevers(array);
            // Assert result
            assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 1}, result);
        }

        @Test
         void convert3NumbersToBlankSpaceSeparatedListReversed() {
            int[] array = {33, 42, 51}; // Initial array
            int[] result = DisplayReverseArrayElements.arrayToStringRevers(array);
            // Assert result
            assertArrayEquals(new int[]{51, 42, 33}, result);
        }

        @Test
         void convert2NumbersToBlankSpaceSeparatedListReversed() {
            int[] array = {3, 4}; // Initial array
            int[] result = DisplayReverseArrayElements.arrayToStringRevers(array);
            // Assert result
            assertArrayEquals(new int[]{4, 3}, result);
        }
    }

