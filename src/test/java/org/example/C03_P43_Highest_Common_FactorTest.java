package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P43_Highest_Common_FactorTest {
    @Test
    public void returnHighestCommonNumberTo24And28() {
        int firstNumber = 24;
        int secondNumber = 28;
        int result = C03_P43_Highest_Common_Factor.findHighestCommonFactor(firstNumber, secondNumber);
        assertEquals(4, result);
    }
}