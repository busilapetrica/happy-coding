package org.example;

import org.example.c03arrays.delete.DeleteElementFromArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _Delete_Element_From_ArrayTest {

    @Test
    public void deleteElementFromArrayOnPosition2() {
        int[] array = {1, 3, 2, 7, 9};
        int deleteposition = 2;
        int[] result = DeleteElementFromArray.deleteElementFromArray(array, deleteposition);
        assertEquals("[1, 2, 7, 9]", Arrays.toString(result));
    }

}