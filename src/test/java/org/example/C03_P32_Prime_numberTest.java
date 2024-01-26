package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class C03_P32_Prime_numberTest {
    @Test
    public void returnTrueAtNumber2IsPrimeNumber() {
        boolean result = C03_P32_Prime_number.findPrimeNumber(2);
        assertEquals(true, result);
    }
    @Test
    public void returnFalseAtNumber15IsNotAPrimeNumber() {
        boolean result = C03_P32_Prime_number.findPrimeNumber(15);
        assertEquals(false, result);
    }
}