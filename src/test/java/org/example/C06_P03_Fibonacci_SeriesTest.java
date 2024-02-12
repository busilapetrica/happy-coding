package org.example;

import org.example.c02controlFlow.generate.C06_P03_Fibonacci_Series;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C06_P03_Fibonacci_SeriesTest {

    @Test
    public void returnFibonacciSeriesOf10Numbers(){
        int seriesNumber = 10;
        String result = C06_P03_Fibonacci_Series.fibonacciStringConstruct(seriesNumber);
        assertEquals("1 1 2 3 5 8 13 21 34 55 ", result);
    }

}