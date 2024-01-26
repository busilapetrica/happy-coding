package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P02_Sum_10_Natural_NumbersTest {
    @Test
    public void returnSumOf10NaturalNumers() {
        int result = C03_P02_Sum_10_Natural_Numbers.sumNaturalNumbers(10);
        assertEquals(55, result);
    }
}