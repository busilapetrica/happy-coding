package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintNNumbersOfFibonacciSeries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNNumbersOf_Fibonacci_SeriesTest {
    @Test
    public void returnTenNumbersOfFibonacciNumbers(){
        String result = PrintNNumbersOfFibonacciSeries.fibonacciNumbers(10);
        assertEquals("0 1 1 2 3 5 8 13 21 34", result);
    }

}