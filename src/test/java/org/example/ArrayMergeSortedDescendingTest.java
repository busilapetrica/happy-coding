package org.example;

import org.example.c03arrays.transform.ArrayMergeSortedDescending;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayMergeSortedDescendingTest {
        @Test
        public void mergeTowArraysWithThreeElementsToCommaSeparatedDescendingList() {
            int[] array1 = {1, 2, 3}; // Initial array1
            int[] array2 = {1, 2, 3}; // Initial array1
            // Call logic
            int[] result = ArrayMergeSortedDescending.mergeArraysAndSorting(array1,array2);
            // Assert result
            assertArrayEquals(new int[]{3, 3, 2, 2, 1, 1}, result);
        }
    @Test
    public void mergeTowArraysWithFourElementsToCommaSeparatedDescendingList() {
        int[] array1 = {1, 2, 3, 4}; // Initial array1
        int[] array2 = {1, 2, 3, 4}; // Initial array1
        // Call logic
        int[] result = ArrayMergeSortedDescending.mergeArraysAndSorting(array1,array2);
        // Assert result
        assertArrayEquals(new int[]{4, 4, 3, 3, 2, 2, 1, 1}, result);
    }
    }

