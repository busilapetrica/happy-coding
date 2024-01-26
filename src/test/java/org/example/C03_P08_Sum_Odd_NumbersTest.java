package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P08_Sum_Odd_NumbersTest {
    @Test
    public void return10oddNumbersAndSumSeparatedWithComma() {
        String result = C03_P08_Sum_Odd_Numbers.displayOddNumbersAndSum(10);
        assertEquals("1 3 5 7 9 11 13 15 17 19 ,100", result);
    }
}