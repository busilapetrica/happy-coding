package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C05_P14_Add_New_Element_To_Unsorted_ArrayTest {
    @Test
    public void addANewElementToAnUnsortedArrayOnPositionOne() {
        int[] array = {1, 3, 2, 7, 9};
        int[] result = C05_P14_Add_New_Element_To_Unsorted_Array.addElementToArray(array, 5);
        assertEquals("[1, 5, 3, 2, 7, 9]", Arrays.toString(result));
    }
}