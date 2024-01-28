package org.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class C05_P01_Display_Array_ElementsTest {
    @Test
    public void return10ElementsInArrayList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] result = C05_P01_Display_Array_Elements.addElementsToNewArray(array);
        // Assert result
        assertArrayEquals(new int[]{1, 1, 5, 3, 4, 5, 6, 7, 8, 9}, result);
    }

    @Test
    public void return3ElementsInArrayList() {
        int[] array = {33, 42, 51}; // Initial array
        int[] result = C05_P01_Display_Array_Elements.addElementsToNewArray(array);
        // Assert result
        assertArrayEquals(new int[]{33, 42, 51}, result);
    }

    @Test
    public void return2ElementsInArrayList() {
        int[] array = {3, 4}; // Initial array
        int[] result = C05_P01_Display_Array_Elements.addElementsToNewArray(array);
        // Assert result
        assertArrayEquals(new int[]{3, 4}, result);
    }


}