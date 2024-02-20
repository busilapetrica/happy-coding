package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.SumOfEvenNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfEvenNumbersTest {
    @Test
    void returnSumOf5EvenNumbersStartsWith2() {
        int result = SumOfEvenNumbers.sumEvenNumbers(5);
        assertEquals(30, result);
    }
}