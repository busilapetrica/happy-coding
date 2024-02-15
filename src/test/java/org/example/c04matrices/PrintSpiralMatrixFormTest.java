package org.example.c04matrices;

import org.example.c04matrices.PrintSpiralMatrixForm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintSpiralMatrixFormTest {
    @Test
    void returnNumbersSpiralOfMatrix5x4() {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}};
        String result = PrintSpiralMatrixForm.makeArraySpiral(matrix);
        assertEquals("1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12 ", result);
    }

    @Test
    void test2X4matrix() {
        int[][] matrix = {{1, 2}, {8, 3}, {7, 4}, {6, 5}};
        String result = PrintSpiralMatrixForm.makeArraySpiral(matrix);
        assertEquals("1 2 3 4 5 6 7 8 ", result);
    }
}