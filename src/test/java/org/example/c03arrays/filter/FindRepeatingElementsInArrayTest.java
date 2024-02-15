package org.example.c03arrays.filter;

import org.example.c03arrays.filter.FindRepeatingElementsInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindRepeatingElementsInArrayTest {
    @Test
    void return2ElementsRepeatedInArray() {
        int[] array = new int[]{2, 7, 4, 7, 8, 3, 4};
        int[] result = FindRepeatingElementsInArray.findAndPrintRepeatingElements(array);
        assertArrayEquals(new int[]{7, 4}, result);
    }

    @Test
    void return2ElementsRepeatedInArrayWhere1ElementRepeated3Times() {
        int[] array = new int[]{2, 7, 4, 7, 8, 7, 4};
        int[] result = FindRepeatingElementsInArray.findAndPrintRepeatingElements(array);
        assertArrayEquals(new int[]{7, 4}, result);
    }
}