package org.example;

import org.example.c03arrays.sort.C07_01_Sorting_Selection_Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C07_01_Sorting_Selection_AlgorithmTest {

    @Test
    public void returnSortedSelectionElementsFromGivenMixedArray() {
        int[] array = new int[]{64, 25, 12, 22, 11};
        int[] result = C07_01_Sorting_Selection_Algorithm.sorting(array);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, result);
    }

}