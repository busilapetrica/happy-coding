package org.example.c03arrays;

import org.example.c03arrays.transform.DisplayElementsUniqueFromArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Display_Elements_Unique_From_ArrayTest {

     @Test
     public void findOneUniqueElement() {
        int[] array = {1, 1, 3}; // Initial array
        int[] result = DisplayElementsUniqueFromArray.uniqueElementsFromArray(array);
        assertArrayEquals(new int[]{3}, result);
     }
    @Test
    public void findTwoUniqueElementsToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 5, 6}; // Initial array
        int[] result = DisplayElementsUniqueFromArray.uniqueElementsFromArray(array);
        assertArrayEquals(new int[]{3, 5, 6}, result);
    }
}

