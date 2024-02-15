package org.example.c03arrays.transform;

import org.example.c03arrays.transform.RotateElementsFromArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateElementsFromArrayTest {
    @Test
    void returnRotatedElementsInArrayFromGivenRotatedPosition() {
        int[] array = new int[]{0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
        int rotatePosition = 4;
        int[] result = RotateElementsFromArray.rotateArray(array, rotatePosition);
        assertArrayEquals(new int[]{12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9}, result);
    }
}