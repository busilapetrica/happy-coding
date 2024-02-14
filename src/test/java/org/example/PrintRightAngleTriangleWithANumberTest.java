package org.example;

import org.example.c02controlFlow.validate.PrintRightAngleTriangleWithANumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintRightAngleTriangleWithANumberTest {
    @Test
    void returnPatternTriangleNumbersWith4Rows() {
        String result = PrintRightAngleTriangleWithANumber.patternTriangleNumbers(4);
        assertEquals("""
                1
                12
                123
                1234
                """, result);
    }
}