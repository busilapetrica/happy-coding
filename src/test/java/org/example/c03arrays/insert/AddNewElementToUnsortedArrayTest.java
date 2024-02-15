package org.example.c03arrays.insert;

import org.example.c03arrays.insert.AddNewElementToUnsortedArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddNewElementToUnsortedArrayTest {
    @Test
     void addANewElementToAnUnsortedArrayOnPositionOne() {
        int[] array = {1, 3, 2, 7, 9};
        int[] result = AddNewElementToUnsortedArray.addElementToArray(array, 5);
        assertArrayEquals(new int[]{1, 5, 3, 2, 7, 9}, result);
    }
}