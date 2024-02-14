package org.example;

import org.example.c03arrays.sort.SortingBubbleAlgorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingBubbleAlgorithmTest {
    @Test
    void returnBubbleSortingElementsFromGivenMixedArray() {
        int[] array = new int[]{64, 25, 12, 22, 11};
        int[] result = SortingBubbleAlgorithm.sorting(array);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, result);
    }

}