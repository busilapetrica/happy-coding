package org.example;

import org.example.c02controlFlow.calculate.SumOfNaturalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Sum_Of_10_Natural_NumbersTest {
    @Test
    public void returnSumOf10NaturalNumers() {
        int result = SumOfNaturalNumbers.sumNaturalNumbers(10);
        assertEquals(55, result);
    }
}