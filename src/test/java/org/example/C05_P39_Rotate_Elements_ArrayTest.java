package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P39_Rotate_Elements_ArrayTest {
    @Test
    public void returnRotatedElementsInArrayFromGivenRotatedPosition() {
        int[] array = new int[]{0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
        int rotatePosition = 4;
        int[] result = C05_P39_Rotate_Elements_Array.rotateArray(array, rotatePosition);
        assertArrayEquals(new int[]{12, 14, 18, 20, 22, 25, 27, 0, 3, 6, 9}, result);
    }
}