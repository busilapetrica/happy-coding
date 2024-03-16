package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumbersTest {
    @Test
    void returnTrueIfNumberIsArmstrongNumber() {
        int number = 4;
        Boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(true, result);
    }
    @Test
    void returnFalseIfNumberIsArmstrongNumber() {
        int number = 11;
        Boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(false, result);
    }
}