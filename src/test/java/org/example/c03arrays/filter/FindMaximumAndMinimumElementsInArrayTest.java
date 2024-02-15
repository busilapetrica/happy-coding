package org.example.c03arrays.filter;

import org.example.c03arrays.filter.FindMaximumAndMinimumElementsInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaximumAndMinimumElementsInArrayTest {
    @Test
     void findMaximAndMinimInArrayWith2Elements() {
        int[] array = {1, 3, 2}; // Initial array1
        // Call logic
        int[] result = FindMaximumAndMinimumElementsInArray.findMaximAndMinimElements(array);
        // Assert result
        assertArrayEquals(new int[] {1, 3}, result);
    }
    @Test
     void findMaximAndMinimInArrayWith4Elements() {
        int[] array = {5, 90, 54, 10}; // Initial array1
        // Call logic
        int[] result = FindMaximumAndMinimumElementsInArray.findMaximAndMinimElements(array);
        // Assert result
        assertArrayEquals(new int[] {5, 90}, result);
    }
}