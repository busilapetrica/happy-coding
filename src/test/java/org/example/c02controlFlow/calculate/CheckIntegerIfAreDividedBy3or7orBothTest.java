package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.CheckIntegerIfAreDividedBy3or7orBoth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIntegerIfAreDividedBy3or7orBothTest {
    @Test
    void return1IfNumberIsDividedWith3() {
        int result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(3);
        assertEquals(1, result);
    }

    @Test
    void return1IfNumberIsDividedWith7() {
        int result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(14);
        assertEquals(1, result);
    }

    @Test
    void return0IfNumberIsNotDividedWith7or3() {
        int result = CheckIntegerIfAreDividedBy3or7orBoth.checkNumber(37);
        assertEquals(0, result);
    }
}