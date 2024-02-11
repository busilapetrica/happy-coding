package org.example.extraProblems;

import org.example.c06challenges.P02_Mine_Fields_Bomb;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P02_Mine_Fields_BombTest {
    @Test
    public void return3x4MatrixMineFieldWith2FieldsBomb() {
        String[][] matrix = new String[3][4];
        int[][] minePositions = {{0, 0},
                                {1, 2}};

        String[][] result = P02_Mine_Fields_Bomb.mineField(matrix,minePositions);
        assertArrayEquals(new String[][]{{"*","2","1","1"},
                                         {"1","2","*","1"},
                                         {"0","1","1","1"}}, result);
    }
}
