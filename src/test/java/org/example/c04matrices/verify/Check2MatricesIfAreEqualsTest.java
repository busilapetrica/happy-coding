package org.example.c04matrices.verify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Check2MatricesIfAreEqualsTest {
    @Test
    void returnFalseWhere2MatrixAreNotEquals() {
        int[][] matrix1 = new int[][]{{1, 3}, {3, 4}};
        int[][] matrix2 = new int[][]{{1, 2}, {3, 4}};

        boolean result = Check2MatricesIfAreEquals.checkEqualMatrix(matrix1, matrix2);
        assertEquals(false, result);
    }

    @Test
    void returnTrueWhere2MatrixAreEquals() {
        int[][] matrix1 = new int[][]{{1, 2}, {3, 4}};
        int[][] matrix2 = new int[][]{{1, 2}, {3, 4}};

        boolean result = Check2MatricesIfAreEquals.checkEqualMatrix(matrix1, matrix2);
        assertEquals(true, result);
    }

}