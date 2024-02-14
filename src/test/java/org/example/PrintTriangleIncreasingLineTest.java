package org.example;

import org.example.c02controlFlow.validate.PrintTriangleIncreasingLine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTriangleIncreasingLineTest {
    @Test
    void returnPatternTriangleWithNumberIncreasingWith4Rows() {
        String result = PrintTriangleIncreasingLine.patternTriangle(4);
        assertEquals("""
                1
                23
                456
                78910
                """, result);
    }
}