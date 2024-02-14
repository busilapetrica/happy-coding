package org.example;

import org.example.c03arrays.search.FindSecondSmallestNumberInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSecondSmallestNumberInArrayTest {
    @Test
    void returnSecondSmallestNumberFromArrayWith5Numbers() {
        int[] array = {1, 3, 2, 7, 9};
        int result = FindSecondSmallestNumberInArray.findSecondSmallestElement(array);
        assertEquals(2, result);
    }

    @Test
    void returnSecondSmallestNumberFromArrayWith2ElementsWhereSecondIsBiggest() {
        int[] array = {7, 9};
        int result = FindSecondSmallestNumberInArray.findSecondSmallestElement(array);
        assertEquals(7, result);
    }

    @Test
    void returnSecondSmallestNumberFromArrayWith2ElementsWhereFirstIsBiggest() {
        int[] array = {9, 7};
        int result = FindSecondSmallestNumberInArray.findSecondSmallestElement(array);
        assertEquals(7, result);
    }

}