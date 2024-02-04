package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C07_01_Selection_SortingTest {

    @Test
    public void returnRotatedElementsInArrayFromGivenRotatedPosition() {
        int[] array = new int[]{64, 25, 12, 22, 11};
        int[] result = C07_01_Selection_Sorting.sorting(array);
        assertArrayEquals(new int[]{11, 12, 22, 25, 64}, result);
    }

}