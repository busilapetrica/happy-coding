package org.example.c03arrays.transform;

import org.example.c03arrays.transform.DisplayElementsUniqueFromArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DisplayElementsUniqueFromArrayTest {

     @Test
      void findOneUniqueElement() {
        int[] array = {1, 1, 3}; // Initial array
        int[] result = DisplayElementsUniqueFromArray.uniqueElementsFromArray(array);
        assertArrayEquals(new int[]{3}, result);
     }
    @Test
     void findTwoUniqueElementsToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 5, 6}; // Initial array
        int[] result = DisplayElementsUniqueFromArray.uniqueElementsFromArray(array);
        assertArrayEquals(new int[]{3, 5, 6}, result);
    }
}

