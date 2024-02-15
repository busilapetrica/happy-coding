package org.example.c04matrices;

import org.example.c04matrices.SumOfRowsAndColumnsToAMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfRowsAndColumnsToAMatrixTest {
    @Test
    void returnSumOfAllRowsAndColumns2DMatrixWith2SubArrays() {
        int[][] array = new int[][]{{1, 2}, {1, 2, 3}};
        int[][] result = SumOfRowsAndColumnsToAMatrix.calculateRowsAndColumns(array);
        assertArrayEquals(new int[][]{{3, 6, 0}, {2, 4, 3}}, result);
    }


    @Test
    void returnSumOfAllRowsAndColumns2DMatrixWith4SubArrays() {
        int[][] array = new int[][]{{1, 2, 3, 2}, {3, 4}, {2, 1, 1, 1}, {3}};
        int[][] result = SumOfRowsAndColumnsToAMatrix.calculateRowsAndColumns(array);
        assertArrayEquals(new int[][]{{8, 7, 5, 3}, {9, 7, 4, 3}}, result);
    }

}