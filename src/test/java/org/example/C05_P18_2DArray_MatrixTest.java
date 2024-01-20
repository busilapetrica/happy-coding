package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P18_2DArray_MatrixTest {
    @Test
    public void vedem  () {
        int[] array1 = {9, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        String result = C05_P18_2DArray_Matrix.patern2DMatrix(array1, array2, array3);
        assertEquals("""
                9 2 3\s
                4 5 6\s
                7 8 9\s""", result);
    }
}