package org.example;

import org.example.c04matrices.C05_P22_Transpose_Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P22_Transpose_MatrixTest {
    @Test
    public void returnTransposeOf2dMatrix() {
        int[][] array = {{1, 2},{3, 4}};
        int[][] result = C05_P22_Transpose_Matrix.transposeMatrix(array);

        assertArrayEquals(new int[][]{{1, 3}, {2, 4}}, result);
    }
}