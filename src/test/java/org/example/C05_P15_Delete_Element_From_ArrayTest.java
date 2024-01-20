package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C05_P15_Delete_Element_From_ArrayTest {

    @Test
    public void deleteElementFromArrayOnPosition2() {
        int[] array = {1, 3, 2, 7, 9};
        int deleteposition = 2;
        int[] result = C05_P15_Delete_Element_From_Array.deleteElementFromArray(array, deleteposition);
        assertEquals("[1, 2, 7, 9]", Arrays.toString(result));
    }

}