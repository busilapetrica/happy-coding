package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P17_Second_Smallest_Number_In_ArrayTest {
    @Test
    public void returnSecondSmallestNumberFromArrayWith5Numbers() {
        int[] array = {1, 3, 2, 7, 9};
        int result = C05_P17_Second_Smallest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(2, result);
    }
    @Test
    public void returnSecondSmallestNumberFromArrayWith2ElementsWhereSecondIsBiggest() {
        int[] array = {7, 9};
        int result = C05_P17_Second_Smallest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(7, result);
    }
    @Test
    public void returnSecondSmallestNumberFromArrayWith2ElementsWhereFirstIsBiggest() {
        int[] array = {9, 7};
        int result = C05_P17_Second_Smallest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(7, result);
    }

}