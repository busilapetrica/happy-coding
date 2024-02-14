package org.example;

import org.example.c04matrices.Print2DMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Print2DMatrixTest {
    @Test
    void returnAMultidimensional2DMatrixWithArrayLengthEquals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        int[][] result = Print2DMatrix.pattern2DMatrix(array1, array2, array3);

        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, result);
    }

    @Test
    void returnAMultidimensional2DMatrixWithArray1LengthNotEqual() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        int[][] result = Print2DMatrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6, 0, 0}, {7, 8, 9, 0, 0}}, result);
    }

    @Test
    void returnAMultidimensional2DMatrixWithArray2LengthNotEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {7, 8, 9};

        int[][] result = Print2DMatrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 0, 0}, {4, 5, 6, 7, 8}, {7, 8, 9, 0, 0}}, result);
    }

    @Test
    void returnAMultidimensional2DMatrixWithArray3LengthNotEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9, 10, 11};

        int[][] result = Print2DMatrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 0, 0}, {4, 5, 6, 0, 0}, {7, 8, 9, 10, 11}}, result);
    }
}

