package org.example;

import org.example.c03arrays.C05_P11_Array_Sorting_Ascending_Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C05_P11_Array_Sorting_Ascending_OrderTest {
    @Test
    public void findAndSortTenElementsInArray() {
        int[] array = {1, 3, 2, 7, 9, 4, 5, 8, 6};
        int[] result = C05_P11_Array_Sorting_Ascending_Order.sortingArrayInAscendingOrder(array);
        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]", Arrays.toString(result));
    }
    @Test
    public void findAndSortFiveElementsInArray() {
        int[] array = {1, 3, 2, 7, 9};
        int[] result = C05_P11_Array_Sorting_Ascending_Order.sortingArrayInAscendingOrder(array);
        assertEquals("[1, 2, 3, 7, 9]", Arrays.toString(result));
    }
}