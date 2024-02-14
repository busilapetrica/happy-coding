package org.example;

import org.example.c03arrays.search.FindSecondLargestNumberInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSecondLargestNumberInArrayTest {
    @Test
    void returnSecondLargestNumberFromArrayWith5Numbers() {
        int[] array = {1, 3, 2, 7, 9};
        int result = FindSecondLargestNumberInArray.findSecondLargestElement(array);
        assertEquals(7, result);
    }

    @Test
    void returnSecondLargestNumberFromArrayWith2ElementsWhereSecondIsBiggest() {
        int[] array = {7, 9};
        int result = FindSecondLargestNumberInArray.findSecondLargestElement(array);
        assertEquals(7, result);
    }

    @Test
    void returnSecondLargestNumberFromArrayWith2ElementsWhereFirstIsBiggest() {
        int[] array = {9, 7};
        int result = FindSecondLargestNumberInArray.findSecondLargestElement(array);
        assertEquals(7, result);
    }

}