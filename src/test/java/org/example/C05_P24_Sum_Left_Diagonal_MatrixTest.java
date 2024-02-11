package org.example;
import org.example.c04matrices.C05_P24_Sum_Left_Diagonal_Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C05_P24_Sum_Diagonal_MatrixTest {

    @Test
    public void returnSumDiagonalLeft2X2Square() {
        int[][] array = new int[][]{
                {1, 2},
                {3, 4}};

        int result = C05_P24_Sum_Left_Diagonal_Matrix.sumLeftDiagonal(array);
        assertEquals(5, result);
    }

    @Test
    public void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int result = C05_P24_Sum_Left_Diagonal_Matrix.sumLeftDiagonal(array);
        assertEquals(15, result);
    }

    @Test
    public void testSumDiagonalLeftEmptyMatrix() {
        int[][] array = new int[][]{{}};

        int result = C05_P24_Sum_Left_Diagonal_Matrix.sumLeftDiagonal(array);
        assertEquals(0, result);
    }
}