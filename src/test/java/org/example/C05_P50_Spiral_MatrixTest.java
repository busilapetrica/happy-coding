package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P50_Spiral_MatrixTest {
    @Test
    public void returnNumbersSpiralOfMatrix5x4() {
        int[][] matrix = {{1, 2, 3, 4, 5},
                         {6, 7, 8, 9, 10},
                         {11,12,13,14,15},
                         {16,17,18,19,20}};
        String result = C05_P50_Spiral_Matrix.makeArraySpiral(matrix);
        assertEquals("1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12 ", result);
    }

}