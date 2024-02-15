package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.PrintRightAngleTriangle;
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