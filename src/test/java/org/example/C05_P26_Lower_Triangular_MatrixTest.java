package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P26_Lower_Triangular_MatrixTest {
    @Test
    public void triangularMatrixAddsZerosToBottomLeftTriangleOfAMatrix() {
        int[][] array = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] result = C05_P26_Lower_Triangular_Matrix.triangularMatrix(array);
        assertArrayEquals(new int[][]{
                {1, 2, 3},
                {0, 5, 6},
                {0, 0, 9}}, result);
    }
}