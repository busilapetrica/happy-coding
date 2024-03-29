package org.example.c05recursion;

import org.example.c05recursion.PrintNNumbersFibonacciSeriesUsingRecursion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNNumbersFibonacciSeriesUsingRecursionTest {

    @Test
     void returnFibonacciSeriesOf10Numbers(){
        int seriesNumber = 10;
        String result = PrintNNumbersFibonacciSeriesUsingRecursion.fibonacciStringConstruct(seriesNumber);
        assertEquals("1 1 2 3 5 8 13 21 34 55 ", result);
    }

}