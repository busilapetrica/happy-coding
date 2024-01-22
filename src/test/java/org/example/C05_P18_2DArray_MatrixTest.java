package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P18_2DArray_MatrixTest {
    @Test
    public void returnAMultidimensional2DMatrixWithArrayLengthEquals() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        int[][] result = C05_P18_2DArray_Matrix.pattern2DMatrix(array1, array2, array3);

        assertArrayEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, result);
    }

    @Test
    public void returnAMultidimensional2DMatrixWithArray1LengthNotEqual() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};

        int[][] result = C05_P18_2DArray_Matrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6, 0, 0}, {7, 8, 9, 0, 0}}, result);
    }

    @Test
    public void returnAMultidimensional2DMatrixWithArray2LengthNotEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7, 8};
        int[] array3 = {7, 8, 9};

        int[][] result = C05_P18_2DArray_Matrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 0, 0}, {4, 5, 6, 7, 8}, {7, 8, 9, 0, 0}}, result);
    }

    @Test
    public void returnAMultidimensional2DMatrixWithArray3LengthNotEqual() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9, 10, 11};

        int[][] result = C05_P18_2DArray_Matrix.pattern2DMatrix(array1, array2, array3);
        assertArrayEquals(new int[][]{{1, 2, 3, 0, 0}, {4, 5, 6, 0, 0}, {7, 8, 9, 10, 11}}, result);
    }
}

