package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class C05_P07_Array_Merge_Sorted_DescendingTest {
        @Test
        public void mergeTowArraysWithThreeElementsToCommaSeparatedDescendingList() {
            int[] array1 = {1, 2, 3}; // Initial array1
            int[] array2 = {1, 2, 3}; // Initial array1
            // Call logic
            int[] result = C05_P07_Array_Merge_Sorted_Descending.mergeArraysAndSorting(array1,array2);
            // Assert result
            assertEquals("[3, 3, 2, 2, 1, 1]", Arrays.toString(result));
        }
    @Test
    public void mergeTowArraysWithFourElementsToCommaSeparatedDescendingList() {
        int[] array1 = {1, 2, 3, 4}; // Initial array1
        int[] array2 = {1, 2, 3, 4}; // Initial array1
        // Call logic
        int[] result = C05_P07_Array_Merge_Sorted_Descending.mergeArraysAndSorting(array1,array2);
        // Assert result
        assertEquals("[4, 4, 3, 3, 2, 2, 1, 1]", Arrays.toString(result));
    }
    }

