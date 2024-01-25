package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P19_Additional_Of_2_MatrixTest {

    @Test
    public void returnAdditionalOf2dMatrix() {
        int[][] array1 = {{1, 2},{3, 4}};
        int[][] array2 = {{5, 6},{7, 8}};

        int[][] result = C05_P19_Additional_Of_2_Matrix.calculateAdditionalMatrix(array1, array2);

        assertArrayEquals(new int[][]{{6, 8}, {10, 12}}, result);
    }

}