package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.FindHighestCommonFactorOf2Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindHighestCommonFactorOf2NumbersTest {
    @Test
    void returnHighestCommonNumberTo24And28() {
        int firstNumber = 24;
        int secondNumber = 28;
        int result = FindHighestCommonFactorOf2Numbers.findHighestCommonFactor(firstNumber, secondNumber);
        assertEquals(4, result);
    }
}