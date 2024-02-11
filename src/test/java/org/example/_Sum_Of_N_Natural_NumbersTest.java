package org.example;

import org.example.c02controlFlow.calculate.SumOfNNaturalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Sum_Of_N_Natural_NumbersTest {
    @Test
    public void returnSumOf7NaturalNumers() {
        String result = SumOfNNaturalNumbers.displayNaturalNumbersAndSum(7);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 28", result);
    }
}