package org.example.c04matrices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Print0ToUpperRightMatrixTest {
    @Test
     void triangularMatrixAddsZerosToUpperRightTriangleOfAMatrix() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] result = Print0TriangularToUpperRightMatrix.addTriangular0ToUpRightMatrix(array);
        assertArrayEquals(new int[][]{
                {1, 0, 0},
                {4, 5, 0},
                {7, 8, 9}}, result);
    }

}