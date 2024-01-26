package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P27_Perfect_NumberTest {
    @Test
    public void returnFalseToNumberNonPerfect(){
        boolean result = C03_P27_Perfect_Number.findPerfectNumber(64);
        assertEquals(false, result);
    }
    @Test
    public void returnTrueToNumberPerfect(){
        boolean result = C03_P27_Perfect_Number.findPerfectNumber(28);
        assertEquals(true, result);
    }

}