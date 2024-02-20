package org.example.c03arrays.calculate;

import org.example.c03arrays.calculate.CountDuplicatesInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicatesInArrayTest {
    @Test
     void findOneDuplicatesInArray() {
        int[] array = {1, 1, 5, 3}; // Initial array
        // Call logic
        int result = CountDuplicatesInArray.findDuplicateInArray(array);
        // Assert result
        assertEquals(1, result);
    }

    @Test
     void findTwoDuplicatesInArray() {
        int[] array = {1, 1, 1, 2, 2, 3 ,4 ,5}; // Initial array
        // Call logic
        int result = CountDuplicatesInArray.findDuplicateInArray(array);
        // Assert result
        assertEquals(2, result);
    }
    @Test
     void findTreeDuplicatesInArray() {
        int[] array = {1, 1, 5, 5, 5, 2, 2, 6}; // Initial array
        // Call logic
        int result = CountDuplicatesInArray.findDuplicateInArray(array);
        // Assert result
        assertEquals(3, result);
    }

    @Test
     void find0DuplicatesInArray() {
        int[] array = {1,2,3,4,5}; // Initial array
        // Call logic
        int result = CountDuplicatesInArray.findDuplicateInArray(array);
        // Assert result
        assertEquals(0, result);
    }

    @Test
     void testEmptyArray() {
        int[] array = {};
        int result = CountDuplicatesInArray.findDuplicateInArray(array);
        assertEquals(0, result);
    }
}