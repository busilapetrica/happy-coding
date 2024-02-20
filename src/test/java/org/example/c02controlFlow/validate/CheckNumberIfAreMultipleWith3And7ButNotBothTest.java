package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.CheckNumberIfAreMultipleWith3And7ButNotBoth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberIfAreMultipleWith3And7ButNotBothTest {
    @Test
    void returnTrueIfNumberIsDividedWith3() {
        boolean result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(9);
        assertTrue(result);
    }

    @Test
    void returnTrueIfNumberIsDividedWith7() {
        boolean result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(14);
        assertTrue(result);
    }

    @Test
    void returnFalseIfNumberIsDividedWith3And7() {
        boolean result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(21);
        assertFalse(result);
    }

    @Test
    void returnTrueIfNumberIsNotDividedWith3And7() {
        boolean result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(11);
        assertTrue(result);
    }
}