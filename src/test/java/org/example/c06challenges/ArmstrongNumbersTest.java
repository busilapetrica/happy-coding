package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumbersTest {
    @Test
    void returnTrueIfNumberIsArmstrongNumberEqualWith153() {
        int number = 153;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(true, result);

    }

    @Test
    void returnTrueIfNumberIsArmstrongNumberEqualWith4() {
        int number = 4;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(true, result);
    }

    @Test
    void returnTrueIfNumberIsArmstrongNumberEqualWith9() {
        int number = 9;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertEquals(true, result);
    }


    @Test
    void returnFalseIfNumberIsArmstrongNumberEqualWith0() {
        int number = 0;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertFalse(result);

    }

    @Test
    void returnFalseIfNumberIsArmstrongNumberEqualWith10() {
        int number = 10;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertFalse(result);
    }

    @Test
    void returnFalseIfNumberIsArmstrongNumberEqualWith112() {
        int number = 112;
        boolean result = ArmstrongNumbers.checkArmstrongNumber(number);
        assertFalse(result);

    }
}


