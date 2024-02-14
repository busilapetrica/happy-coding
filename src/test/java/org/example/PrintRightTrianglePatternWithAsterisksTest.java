package org.example;

import org.example.c02controlFlow.validate.PrintRightTrianglePatternWithAsterisks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintRightTrianglePatternWithAsterisksTest {
    @Test
    void returnPatternTriangleOf4Rows() {
        String result = PrintRightTrianglePatternWithAsterisks.trianglePattern(4);
        assertEquals("""
                *
                **
                ***
                ****
                """, result);
    }

}