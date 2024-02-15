package org.example.c03arrays.sort;

import org.example.c03arrays.sort.InsertionSortAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortAlgorithmTest {
    @Test
     void returnSortedArrayUsingInsertionAlgorithm() {
        int[] array = {1,3,2,5,4,7,9,8,6}; // Initial array
        // Call logic
        int[] result = InsertionSortAlgorithm.sortArray(array);
        // Assert result
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, result);
    }

}