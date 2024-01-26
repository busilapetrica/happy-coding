package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P03_Sum_N_Natural_NumbersTest {
    @Test
    public void returnSumOf7NaturalNumers() {
        String result = C03_P03_Sum_N_Natural_Numbers.displayNaturalNumbersAndSum(7);
        assertEquals("1, 2, 3, 4, 5, 6, 7, 28", result);
    }
}