package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P30_Matrix_EqualsTest {
    @Test
    public void returnFalseWhere2MatrixAreNotEquals() {
        int[][] matrix1 = new int[][]{{1,3},{3,4}};
        int[][] matrix2 = new int[][]{{1,2},{3,4}};

        boolean result = C05_P30_Matrix_Equals.checkEqualMatrix(matrix1, matrix2);
        assertEquals(false, result);
    }

    @Test
    public void returnTrueWhere2MatrixAreEquals() {
        int[][] matrix1 = new int[][]{{1,2},{3,4}};
        int[][] matrix2 = new int[][]{{1,2},{3,4}};

        boolean result = C05_P30_Matrix_Equals.checkEqualMatrix(matrix1, matrix2);
        assertEquals(true, result);
    }

}