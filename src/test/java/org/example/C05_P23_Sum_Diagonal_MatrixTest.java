package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P23_Sum_Diagonal_MatrixTest {
    @Test
    public void returnSumDiagonal2X2Square() {
        int[][] array = {
                {1, 2,},
                {3, 4}};

        int result = C05_P23_Sum_Diagonal_Matrix.diagonalMatrixSum(array);
        assertEquals(5, result);

    }
    @Test
    public void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = {{1, 2}, {3}, {6,7,8}}; // Initial array
        // Call logic
        int result = C05_P23_Sum_Diagonal_Matrix.diagonalMatrixSum(array);
        // Assert result
        assertEquals(9, result);
    }
}