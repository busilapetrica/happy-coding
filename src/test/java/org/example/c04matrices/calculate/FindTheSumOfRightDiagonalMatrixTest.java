package org.example.c04matrices.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheSumOfRightDiagonalMatrixTest {
    @Test
    void returnSumDiagonal2X2Square() {
        int[][] array = {
                {1, 2,},
                {3, 4}};

        int result = FindTheSumOfRightDiagonalMatrix.diagonalRightMatrixSum(array);
        assertEquals(5, result);

    }

    @Test
    void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = {{1, 2}, {3}, {6, 7, 8}}; // Initial array
        // Call logic
        int result = FindTheSumOfRightDiagonalMatrix.diagonalRightMatrixSum(array);
        // Assert result
        assertEquals(9, result);
    }
}