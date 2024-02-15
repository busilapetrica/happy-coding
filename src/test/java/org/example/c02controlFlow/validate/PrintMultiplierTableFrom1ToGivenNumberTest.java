package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.PrintMultiplierTableFrom1ToGivenNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintMultiplierTableFrom1ToGivenNumberTest {
    @Test
    void returnTableMultipliedWith8() {
        String result = PrintMultiplierTableFrom1ToGivenNumber.multiplierTable(8);
        assertEquals("""
                1X1=1,1X2=2,1X3=3,1X4=4,1X5=5,1X6=6,1X7=7,1X8=8,
                2X1=2,2X2=4,2X3=6,2X4=8,2X5=10,2X6=12,2X7=14,2X8=16,
                3X1=3,3X2=6,3X3=9,3X4=12,3X5=15,3X6=18,3X7=21,3X8=24,
                4X1=4,4X2=8,4X3=12,4X4=16,4X5=20,4X6=24,4X7=28,4X8=32,
                5X1=5,5X2=10,5X3=15,5X4=20,5X5=25,5X6=30,5X7=35,5X8=40,
                6X1=6,6X2=12,6X3=18,6X4=24,6X5=30,6X6=36,6X7=42,6X8=48,
                7X1=7,7X2=14,7X3=21,7X4=28,7X5=35,7X6=42,7X7=49,7X8=56,
                8X1=8,8X2=16,8X3=24,8X4=32,8X5=40,8X6=48,8X7=56,8X8=64,
                                """, result);
    }

}