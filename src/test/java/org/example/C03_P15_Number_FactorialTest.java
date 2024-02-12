package org.example;

import org.example.c02controlFlow.calculate.C03_P15_Number_Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P15_Number_FactorialTest {
    @Test
    public void returnFactorialNumberOf5() {
        int result = C03_P15_Number_Factorial.factorialNumber(5);
        assertEquals(120, result);
    }

}