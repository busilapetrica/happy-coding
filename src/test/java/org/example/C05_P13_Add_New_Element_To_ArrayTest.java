
package org.example;

import org.example.c03arrays.insert.C05_P13_Add_New_Element_To_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P13_Add_New_Element_To_ArrayTest {

    @Test
    public void addNewElementToArrayWithAscendingOrder() {
        int[] array = {2, 5, 7, 9, 11};
        int[] result = C05_P13_Add_New_Element_To_Array.addElementToArray(array, 8);
        assertArrayEquals(new int[]{2, 5, 7, 8, 9, 11}, result);
    }

    @Test
    public void addNewElementInToEptyArray() {
        int[] array = {};
        int[] result = C05_P13_Add_New_Element_To_Array.addElementToArray(array, 8);
        assertArrayEquals(new int[]{8}, result);
    }

    @Test
    public void testAddElementAtTheEndOfArray() {
        int[] array = {1, 3, 5};
        int[] result = C05_P13_Add_New_Element_To_Array.addElementToArray(array, 7);
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }

    @Test
    public void testAddElementAtTheBeginningOfArray() {
        int[] array = {2, 3, 5};
        int[] result = C05_P13_Add_New_Element_To_Array.addElementToArray(array, 1);
        assertArrayEquals(new int[]{1, 2, 3, 5}, result);
    }
}



