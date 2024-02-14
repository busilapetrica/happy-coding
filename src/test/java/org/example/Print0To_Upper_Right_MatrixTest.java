package org.example;

import org.example.c04matrices.Print0TriangularToUpperRightMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Print0To_Upper_Right_MatrixTest {
    @Test
    public void triangularMatrixAddsZerosToUpperRightTriangleOfAMatrix() {
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