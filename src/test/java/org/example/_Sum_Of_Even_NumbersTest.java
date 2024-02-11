package org.example;

import org.example.c02controlFlow.calculate.SumOfEvenNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Sum_Of_Even_NumbersTest {
    @Test
    public void returnSumOf5EvenNumbersStartsWith2() {
        int result = SumOfEvenNumbers.sumEvenNumbers(5);
        assertEquals(30, result);
    }
}