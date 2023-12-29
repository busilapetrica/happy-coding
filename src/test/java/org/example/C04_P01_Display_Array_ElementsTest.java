package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class  C04_P01_Display_Array_ElementsTest {
    @Test
    public void TestElementsOfArrayIfTheyAreCorrect() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] resultArray = C04_P01_Display_Array_Elements.addElementsToArray(array);
        // Assert result
        assertEquals(Arrays.toString(array), Arrays.toString(resultArray));
    }
}