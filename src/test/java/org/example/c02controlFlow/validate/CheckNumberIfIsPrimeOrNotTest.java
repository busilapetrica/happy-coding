package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.CheckNumberIfIsPrimeOrNot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class CheckNumberIfIsPrimeOrNotTest {
    @Test
     void returnTrueAtNumber2IsPrimeNumber() {
        boolean result = CheckNumberIfIsPrimeOrNot.findPrimeNumber(2);
        assertEquals(true, result);
    }
    @Test
     void returnFalseAtNumber15IsNotAPrimeNumber() {
        boolean result = CheckNumberIfIsPrimeOrNot.findPrimeNumber(15);
        assertEquals(false, result);
    }
}