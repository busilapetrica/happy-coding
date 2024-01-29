package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P25_Sum_Matrix_Rows_ColumnsTest {
    @Test
    public void returnSumOfAllRowsAndColumns2DMatrixWith2SubArrays() {
        int[][] array = new int[][]{{1, 2}, {1,2,3}};
        int[][] result = C05_P25_Sum_Matrix_Rows_Columns.calculateRowsAndColumns(array);
        assertArrayEquals(new int[][] {{3,6,0}, {2,4,3}}, result);
    }


    @Test
    public void returnSumOfAllRowsAndColumns2DMatrixWith4SubArrays() {
        int[][] array = new int[][]{{1, 2, 3, 2}, {3, 4}, {2, 1, 1, 1}, {3}};
        int[][] result = C05_P25_Sum_Matrix_Rows_Columns.calculateRowsAndColumns(array);
        assertArrayEquals(new int[][] {{8,7,5,3}, {9,7,4,3}}, result);
    }

}