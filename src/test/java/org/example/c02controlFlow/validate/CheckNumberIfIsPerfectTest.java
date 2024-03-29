package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.CheckNumberIfIsPerfect;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberIfIsPerfectTest {
    @Test
    void returnFalseToNumberNonPerfect() {
        boolean result = CheckNumberIfIsPerfect.findPerfectNumber(64);
        assertEquals(false, result);
    }

    @Test
    void returnTrueToNumberPerfect() {
        boolean result = CheckNumberIfIsPerfect.findPerfectNumber(28);
        assertEquals(true, result);
    }

}