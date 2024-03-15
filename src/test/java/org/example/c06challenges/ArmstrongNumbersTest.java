package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumbersTest {
    @Test
    void returnTrueIfNumberIsArmstrongNumber() {
        int number = 1;
        Boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(true, result);
    }
    @Test
    void returnFalseIfNumberIsArmstrongNumber() {
        int number = 10;
        Boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(false, result);
    }
}