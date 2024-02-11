package org.example;

import org.example.c02controlFlow.calculate.SumOfOddNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Sum_Of_Odd_NumbersTest {
    @Test
    public void return10oddNumbersAndSumSeparatedWithComma() {
        String result = SumOfOddNumbers.displayOddNumbersAndSum(10);
        assertEquals("1 3 5 7 9 11 13 15 17 19 ,100", result);
    }
}