package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P06_Print_Elements_Unique_In_ArrayTest {

     @Test
     public void findOneUniqueElement() {
        int[] array = {1, 1, 3}; // Initial array
        int[] result = C05_P06_Print_Elements_Unique_In_Array.uniqueElementsFromArray(array);
        assertEquals(new int[]{3}, result);
     }
    @Test
    public void findTwoUniqueElementsToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 5, 6}; // Initial array
        int[] result = C05_P06_Print_Elements_Unique_In_Array.uniqueElementsFromArray(array);
        assertEquals(new int[]{3, 6}, result);
    }

    @Test
    public void findThreeUniqueElementsToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 3, 6, 7, 8, 8}; // Initial array
        int[] result = C05_P06_Print_Elements_Unique_In_Array.uniqueElementsFromArray(array);
        assertEquals(new int[]{5, 6, 7}, result); 
    }
}
