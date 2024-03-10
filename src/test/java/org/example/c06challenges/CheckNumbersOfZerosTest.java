package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumbersOfZerosTest {
    @Test
    void returnCountOfMatrixWith3Zeros() {
        int[][] matrix = new int[][] {{0,0}, {1,0}};
        int result = CheckNumbersOfZeros.checkNumbersOfZeros(matrix);
        assertEquals(3, result);
    }
}