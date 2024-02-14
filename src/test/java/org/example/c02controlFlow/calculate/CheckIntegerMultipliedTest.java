package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.CheckIntegerMultiplied;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntegerMultipliedTest {
    @Test
    void returnIf2NumbersAreMultiplied() {
        int number1 = 5;
        int number2 = 15;
        String result = CheckIntegerMultiplied.checkMultipliedInt(number1, number2);
        assertEquals("Multiplied!", result);
    }

    @Test
    void returnIf2NumbersAreNotMultiplied() {
        int number1 = 14;
        int number2 = 5;
        String result = CheckIntegerMultiplied.checkMultipliedInt(number1, number2);
        assertEquals("Not Multiplied!", result);
    }

}