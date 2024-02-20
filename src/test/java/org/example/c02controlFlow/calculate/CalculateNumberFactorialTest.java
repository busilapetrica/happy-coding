package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.CalculateNumberFactorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateNumberFactorialTest {
    @Test
    void returnFactorialNumberOf5() {
        int result = CalculateNumberFactorial.factorialNumber(5);
        assertEquals(120, result);
    }

}