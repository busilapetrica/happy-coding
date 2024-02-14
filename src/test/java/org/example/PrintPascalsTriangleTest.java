package org.example;

import org.example.c02controlFlow.validate.PrintPascalsTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintPascalsTriangleTest {
    @Test
    void returnPascalsTrianglePatternWith5Rows() {
        int rows = 5;
        String result = PrintPascalsTriangle.pascalsTriangle(rows);
        assertEquals("""
                    1 \s
                   1  1 \s
                  1  2  1 \s
                 1  3  3  1 \s
                1  4  6  4  1 \s
                                 """, result);
    }

}