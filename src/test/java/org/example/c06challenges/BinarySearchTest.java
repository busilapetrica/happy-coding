package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
     void returnIndexOfElementFoundInArrayOfNumber15() {
        int[] array = {11, 12, 13, 14, 15};
        int result = BinarySearch.binarySearch(array,15);
        assertEquals(4, result);
    }
    @Test
    void returnMinusOneIfNumberNotExistInArray() {
        int[] array = {11, 12, 13, 14, 15};
        int result = BinarySearch.binarySearch(array,1);
        assertEquals(-1, result);
    }

    @Test
    void returnIndexOfElementFoundInArrayOfNumber11() {
        int[] array = {11, 12, 13, 14, 15};
        int result = BinarySearch.binarySearch(array,11);
        assertEquals(0, result);
    }
}