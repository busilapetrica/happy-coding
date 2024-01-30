package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class C05_P27_Upper_Triangular_MatrixTest {
    @Test
    public void triangularMatrixAddsZerosToUpperRightTriangleOfAMatrix() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] result = C05_P27_Upper_Triangular_Matrix.triangular0UpRightMatrix(array);
        assertArrayEquals(new int[][]{
                {1, 0, 0},
                {4, 5, 0},
                {7, 8, 9}}, result);
    }

}