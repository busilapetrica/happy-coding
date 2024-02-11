package org.example;

import org.example.c04matrices.C05_P19_Additional_Of_2_Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P19_Additional_Of_2_MatrixTest {

    @Test
    public void returnAdditionalOf2dMatrix() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};

        int[][] result = C05_P19_Additional_Of_2_Matrix.calculateAdditionalMatrix(matrix1, matrix2);
        assertArrayEquals(new int[][]{{6, 8}, {10, 12}}, result);
    }

    @Test
    public void returnAdditionalOf2x2And3x3Matrix() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6, 9}, {7, 8, 10}};

        int[][] result = C05_P19_Additional_Of_2_Matrix.calculateAdditionalMatrix(matrix1, matrix2);
        assertArrayEquals(new int[][]{{6, 8, 9}, {10, 12, 10}}, result);
    }

    @Test
    public void returnAdditionalOf2x2And2X1Matrix() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}};

        int[][] result = C05_P19_Additional_Of_2_Matrix.calculateAdditionalMatrix(matrix1, matrix2);
        assertArrayEquals(new int[][]{{6, 8}, {3, 4}}, result);
    }

}