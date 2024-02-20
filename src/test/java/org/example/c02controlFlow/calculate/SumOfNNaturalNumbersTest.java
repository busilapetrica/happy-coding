package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.SumOfNNaturalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNNaturalNumbersTest {
    @Test
    void returnSumOf7NaturalNumbers() {
        String result = SumOfNNaturalNumbers.displayNaturalNumbersAndSum(7);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 28", result);
    }
}