package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintRightTrianglePatternWithAsterisks;
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