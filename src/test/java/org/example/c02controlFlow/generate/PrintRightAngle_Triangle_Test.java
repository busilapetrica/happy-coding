package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintRightAngleTriangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintRightAngle_Triangle_Test {
    @Test
    public void returnPatternTriangleWithSameNumberOnRow() {
        String result = PrintRightAngleTriangle.triangleRepeatNumber(4);
        assertEquals("""
                                1
                                22
                                333
                                4444
                                """, result);
    }

}