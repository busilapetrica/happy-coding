package org.example.c03arrays.transform;

import org.example.c03arrays.sort.ArraySortingDescendingOrder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraySortingDescendingOrderTest {
    @Test
     void findAndSortTenElementsInDescendingOrder() {
        int[] array = {1, 3, 2, 7, 9, 4, 5, 8, 6};
        int[] result = ArraySortingDescendingOrder.sortingArrayInDescendingOrder(array);
        assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1]", Arrays.toString(result));
    }
    @Test
     void findAndSortFiveElementsInDescendingOrder() {
        int[] array = {1, 3, 2, 7, 9};
        int[] result = ArraySortingDescendingOrder.sortingArrayInDescendingOrder(array);
        assertEquals("[9, 7, 3, 2, 1]", Arrays.toString(result));
    }

}