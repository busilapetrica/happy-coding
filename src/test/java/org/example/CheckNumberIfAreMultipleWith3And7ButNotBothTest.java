package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberIfAreMultipleWith3And7ButNotBothTest {
    @Test
    void return1IfNumberIsDividedWith3() {
        int result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(9);
        assertEquals(1, result);
    }

    @Test
    void return0IfNumberIsDividedWith7() {
        int result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(14);
        assertEquals(1, result);
    }

    @Test
    void return0IfNumberIsDividedWith3And7() {
        int result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(21);
        assertEquals(0, result);
    }

    @Test
    void return0IfNumberIsNotDividedWith3And7() {
        int result = CheckNumberIfAreMultipleWith3And7ButNotBoth.checkNumber(11);
        assertEquals(1, result);
    }
}