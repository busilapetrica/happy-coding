package org.example;

import org.example.c03arrays.search.C05_P16_Second_Largest_Number_In_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P16_Second_Largest_Number_In_ArrayTest {
    @Test
    public void returnSecondLargestNumberFromArrayWith5Numbers() {
        int[] array = {1, 3, 2, 7, 9};
        int result = C05_P16_Second_Largest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(7, result);
    }
@Test
    public void returnSecondLargestNumberFromArrayWith2ElementsWhereSecondIsBiggest() {
        int[] array = {7, 9};
        int result = C05_P16_Second_Largest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(7, result);
    }

    @Test
    public void returnSecondLargestNumberFromArrayWith2ElementsWhereFirstIsBiggest() {
        int[] array = {9, 7};
        int result = C05_P16_Second_Largest_Number_In_Array.findSecondLargestElement(array);
        assertEquals(7, result);
    }

}