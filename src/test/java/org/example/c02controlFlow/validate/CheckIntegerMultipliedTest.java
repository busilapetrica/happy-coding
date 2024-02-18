package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.CheckIntegerMultiplied;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntegerMultipliedTest {
    @Test
    void returnIf2NumbersAreMultiplied() {
        int number1 = 5;
        int number2 = 15;
        boolean result = CheckIntegerMultiplied.checkMultipliedInt(number1, number2);
        assertEquals(true, result);
    }

    @Test
    void returnIf2NumbersAreNotMultiplied() {
        int number1 = 14;
        int number2 = 5;
        boolean result = CheckIntegerMultiplied.checkMultipliedInt(number1, number2);
        assertEquals(false, result);
    }

}