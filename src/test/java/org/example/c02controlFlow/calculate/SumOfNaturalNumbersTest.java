package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.SumOfNaturalNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNaturalNumbersTest {
    @Test
    void returnSumOf10NaturalNumbers() {
        int result = SumOfNaturalNumbers.sumNaturalNumbers(10);
        assertEquals(55, result);
    }
}