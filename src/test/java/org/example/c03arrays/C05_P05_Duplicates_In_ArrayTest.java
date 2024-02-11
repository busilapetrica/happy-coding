package org.example.c03arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P05_Duplicates_In_ArrayTest {
    @Test
    public void findOneDuplicatesInArray() {
        int[] array = {1, 1, 5, 3}; // Initial array
        // Call logic
        int result = C05_P05_Duplicates_In_Array.findDuplicateInArray(array);
        // Assert result
        assertEquals(1, result);
    }

    @Test
    public void findTwoDuplicatesInArray() {
        int[] array = {1, 1, 1, 2, 2, 3 ,4 ,5}; // Initial array
        // Call logic
        int result = C05_P05_Duplicates_In_Array.findDuplicateInArray(array);
        // Assert result
        assertEquals(2, result);
    }
    @Test
    public void findTreeDuplicatesInArray() {
        int[] array = {1, 1, 5, 5, 5, 2, 2, 6}; // Initial array
        // Call logic
        int result = C05_P05_Duplicates_In_Array.findDuplicateInArray(array);
        // Assert result
        assertEquals(3, result);
    }

    @Test
    public void find0DuplicatesInArray() {
        int[] array = {1,2,3,4,5}; // Initial array
        // Call logic
        int result = C05_P05_Duplicates_In_Array.findDuplicateInArray(array);
        // Assert result
        assertEquals(0, result);
    }

    @Test
    public void testEmptyArray() {
        int[] array = {};
        int result = C05_P05_Duplicates_In_Array.findDuplicateInArray(array);
        assertEquals(0, result);
    }
}