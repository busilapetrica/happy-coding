package org.example;

import org.example.c03arrays.sort.SortingSelectionAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingSelectionAlgorithmTest {

    @Test
     void returnSortedSelectionElementsFromGivenMixedArray() {
        int[] array = new int[]{64, 25, 12, 22, 11};
        int[] result = SortingSelectionAlgorithm.sorting(array);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, result);
    }

}