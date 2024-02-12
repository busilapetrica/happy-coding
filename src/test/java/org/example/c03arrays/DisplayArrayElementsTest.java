package org.example.c03arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.transform.C05_P01_Display_Array_Elements;
import org.junit.jupiter.api.Test;

class DisplayArrayElementsTest {
    @Test
    public void return10ElementsInArrayList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] result = C05_P01_Display_Array_Elements.addElementsToNewArray(array);
        // Assert result
        assertArrayEquals(new int[]{1, 1, 5, 3, 4, 5, 6, 7, 8, 9}, result);
    }
}