package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

class C04_P01_Display_Array_ElementsTest {
    @Test
    public void convertNumbersToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        String result = C04_P01_Display_Array_Elements.addElementsToArray(array);
        // Assert result
        assertEquals("1, 1, 5, 3, 4, 5, 6, 7, 8, 9", result);
    }

    @Test
    public void convert3NumbersToBlankSpaceSeparatedList() {
        int[] array = {33, 42, 51}; // Initial array
        String result = C04_P01_Display_Array_Elements.addElementsToArray(array);
        // Assert result
        assertEquals("33, 42, 51", result);
    }

    @Test
    public void convert2NumbersToBlankSpaceSeparatedList() {
        int[] array = {3, 4}; // Initial array
        String result = C04_P01_Display_Array_Elements.addElementsToArray(array);
        // Assert result
        assertEquals("3, 4", result);
    }


}
