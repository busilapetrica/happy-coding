package org.example.c04matrices.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeOfGivenMatrixTest {
    @Test
    void returnTransposeOf2dMatrix() {
        int[][] array = {{1, 2}, {3, 4}};
        int[][] result = TransposeOfGivenMatrix.transposeMatrix(array);

        assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, result);
    }
}