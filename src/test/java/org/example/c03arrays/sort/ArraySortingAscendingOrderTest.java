package org.example.c03arrays.sort;

import org.example.c03arrays.transform.ArraySortingAscendingOrder;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ArraySortingAscendingOrderTest {
    @Test
     void findAndSortTenElementsInArray() {
        int[] array = {1, 3, 2, 7, 9, 4, 5, 8, 6};
        int[] result = ArraySortingAscendingOrder.sortingArrayInAscendingOrder(array);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(result));
    }
    @Test
     void findAndSortFiveElementsInArray() {
        int[] array = {1, 3, 2, 7, 9};
        int[] result = ArraySortingAscendingOrder.sortingArrayInAscendingOrder(array);
        assertEquals("[1, 2, 3, 7, 9]", Arrays.toString(result));
    }
}