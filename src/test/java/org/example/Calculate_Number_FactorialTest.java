package org.example;

import org.example.c02controlFlow.calculate.CalculateNumberFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculate_Number_FactorialTest {
    @Test
    public void returnFactorialNumberOf5() {
        int result = CalculateNumberFactorial.factorialNumber(5);
        assertEquals(120, result);
    }

}