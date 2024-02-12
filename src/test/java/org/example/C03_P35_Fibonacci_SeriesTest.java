package org.example;

import org.example.c02controlFlow.generate.C03_P35_Fibonacci_Series;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P35_Fibonacci_SeriesTest {
    @Test
    public void returnTenNumbersOfFibonacciNumbers(){
        String result = C03_P35_Fibonacci_Series.fibonacciNumbers(10);
        assertEquals("0 1 1 2 3 5 8 13 21 34", result);
    }

}