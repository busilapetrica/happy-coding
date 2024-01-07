
    package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

    class C04_P02_Display_Reverse_Array_ElementsTest {
        @Test
        public void convertNumbersToCommaSeparatedListReversed() {
            int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // Initial array
            // Call logic
            String result = C04_P02_Display_Reverse_Array_Elements.arrayToStringRevers(array);
            // Assert result
            assertEquals("9, 8, 7, 6, 5, 4, 3, 2, 1, 1", result);
        }

        @Test
        public void convert3NumbersToBlankSpaceSeparatedListReversed() {
            int[] array = {33, 42, 51}; // Initial array
            String result = C04_P02_Display_Reverse_Array_Elements.arrayToStringRevers(array);
            // Assert result
            assertEquals("51, 42, 33", result);
        }

        @Test
        public void convert2NumbersToBlankSpaceSeparatedListReversed() {
            int[] array = {3, 4}; // Initial array
            String result = C04_P02_Display_Reverse_Array_Elements.arrayToStringRevers(array);
            // Assert result
            assertEquals("4, 3", result);
        }


    }

