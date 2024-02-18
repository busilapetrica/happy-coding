package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.CheckIntegerIfAreDividedBy3or7orBoth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntegerIfAreDividedBy3or7orBothTest {
    @Test
    void returnTrueIfNumberIsDividedWith3() {
        boolean result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(3);
        assertTrue(result);
    }

    @Test
    void returnTrueIfNumberIsDividedWith7() {
        boolean result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(14);
        assertTrue(result);
    }

    @Test
    void returnFalseIfNumberIsNotDividedWith7or3() {
        boolean result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(37);
        assertFalse(result);
    }
}