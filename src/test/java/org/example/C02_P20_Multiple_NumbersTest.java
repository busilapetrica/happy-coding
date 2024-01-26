package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C02_P20_Multiple_NumbersTest {
    @Test
    public void return1IfNumberIsNotDividedWith3And7() {
        int result = C02_P20_Multiple_Numbers.checkNumber(3);
        assertEquals(1, result);
    }

    @Test
    public void return0IfNumberIsDividedWith3And7() {
        int result = C02_P20_Multiple_Numbers.checkNumber(21);
        assertEquals(0, result);
    }
}