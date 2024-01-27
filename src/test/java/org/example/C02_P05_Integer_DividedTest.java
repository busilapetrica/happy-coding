package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C02_P05_Integer_DividedTest {
    @Test
    public void return1IfNumberIsDividedWith3() {
        int result = C02_P05_Integer_Divided.checkNumber(3);
        assertEquals(1, result);
    }

    @Test
    public void return1IfNumberIsDividedWith7() {
        int result = C02_P05_Integer_Divided.checkNumber(14);
        assertEquals(1, result);
    }
    @Test
    public void return0IfNumberIsNotDividedWith7or3() {
        int result = C02_P05_Integer_Divided.checkNumber(37);
        assertEquals(0, result);
    }
}