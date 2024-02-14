package org.example;

import org.example.c04matrices.FindSumOfLeftDiagonalMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindSumOfLeftDiagonalMatrixTest {

    @Test
    void returnSumDiagonalLeft2X2Square() {
        int[][] array = new int[][]{
                {1, 2},
                {3, 4}};

        int result = FindSumOfLeftDiagonalMatrix.sumLeftDiagonal(array);
        assertEquals(5, result);
    }

    @Test
    void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int result = FindSumOfLeftDiagonalMatrix.sumLeftDiagonal(array);
        assertEquals(15, result);
    }

    @Test
    void testSumDiagonalLeftEmptyMatrix() {
        int[][] array = new int[][]{{}};

        int result = FindSumOfLeftDiagonalMatrix.sumLeftDiagonal(array);
        assertEquals(0, result);
    }
}