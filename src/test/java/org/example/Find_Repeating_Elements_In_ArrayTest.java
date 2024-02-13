package org.example;

import org.example.c03arrays.search.FindRepeatingElementsInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Find_Repeating_Elements_In_ArrayTest {
    @Test
    public void return2ElementsRepeatedInArray() {
        int[] array = new int[]{2, 7, 4, 7, 8, 3, 4};
        int[] result = FindRepeatingElementsInArray.findAndPrintRepeatingElements(array);
        assertArrayEquals(new int[]{7, 4}, result);
    }

    @Test
    public void return2ElementsRepeatedInArrayWhere1ElementRepeated3Times() {
        int[] array = new int[]{2, 7, 4, 7, 8, 7, 4};
        int[] result = FindRepeatingElementsInArray.findAndPrintRepeatingElements(array);
        assertArrayEquals(new int[]{7, 4}, result);
    }
}