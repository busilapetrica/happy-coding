package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P16_Sum_Even_NumbersTest {
    @Test
    public void returnSumOf5EvenNumbersStartsWith2() {
        int result = C03_P16_Sum_Even_Numbers.sumEvenNumbers(5);
        assertEquals(30, result);
    }
}