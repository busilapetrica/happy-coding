package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumbersOfZerosTest {
    @Test
    void returnTrueIfIsASparseMatrix() {
        int[][] matrix = new int[][]{{0, 0},
                                     {1, 0}};

        boolean result = CheckNumbersOfZeros.checkNumbersOfZeros(matrix);
        assertEquals(false, result);
    }

    @Test
    void returnFalseIfIsNotASparseMatrix() {
        int[][] matrix = new int[][]{{1, 1},
                                     {1, 0}};

        boolean result = CheckNumbersOfZeros.checkNumbersOfZeros(matrix);
        assertEquals(true, result);
    }
}