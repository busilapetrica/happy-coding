package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C02_P20_Multiple_NumbersTest {
    @Test
    public void return1IfNumberIsDividedWith3() {
        int result = C02_P20_Multiple_Numbers.checkNumber(9);
        assertEquals(1, result);
    }

    @Test
    public void return0IfNumberIsDividedWith7() {
        int result = C02_P20_Multiple_Numbers.checkNumber(14);
        assertEquals(1, result);
    }

    @Test
    public void return0IfNumberIsDividedWith3And7() {
        int result = C02_P20_Multiple_Numbers.checkNumber(21);
        assertEquals(0, result);
    }
    @Test
    public void return0IfNumberIsNotDividedWith3And7() {
        int result = C02_P20_Multiple_Numbers.checkNumber(11);
        assertEquals(1, result);
    }
}