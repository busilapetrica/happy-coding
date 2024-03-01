package org.example.c03arrays.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortAlgorithmTest {

    @Test
    void returnSortedArrayUsingQuickSortAlgorithm() {
        int[] array = {12, 11, 13, 5, 6, 7};
        int[] result = QuickSortAlgorithm.quickSort(array);

        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, result);
    }

}