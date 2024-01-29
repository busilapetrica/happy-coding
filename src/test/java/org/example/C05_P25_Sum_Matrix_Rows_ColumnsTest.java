package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P25_Sum_Matrix_Rows_ColumnsTest {
    @Test
    public void returnSumDiagonal3X3SquareAdding0ToBeEquals() {
        int[][] array = new int[][]{{1, 2}, {1,2,3}};
        int[][] result = C05_P25_Sum_Matrix_Rows_Columns.calculateRowsAndColumns(array);
        assertArrayEquals(new int[][] {{3,6,0}, {2,4,3}}, result);
    }

}