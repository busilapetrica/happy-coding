package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class C05_P24_Sum_Diagonal_MatrixTest {

    @Test
    public void returnSumDiagonalLeft2X2Square() {
        int[][] array = new int[][]{{1, 2}, {3, 4}};
        int result = C05_P24_Sum_Left_Diagonal_Matrix.sumLeftDiagonal(array);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = new int[][]{{1, 2}, {3}, {6, 7, 8}};
        int result = C05_P24_Sum_Left_Diagonal_Matrix.sumLeftDiagonal(array);
        Assertions.assertEquals(9, result);
    }
}