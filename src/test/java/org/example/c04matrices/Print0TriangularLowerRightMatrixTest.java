package org.example.c04matrices;

import org.example.c04matrices.Print0TriangularLowerRightMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Print0TriangularLowerRightMatrixTest {
    @Test
    void triangularMatrixAddsZerosToBottomLeftTriangleOfAMatrix() {
        int[][] array = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] result = Print0TriangularLowerRightMatrix.addTriangular0ToLowerRightMatrix(array);
        assertArrayEquals(new int[][]{
                {1, 2, 3},
                {0, 5, 6},
                {0, 0, 9}}, result);
    }
}