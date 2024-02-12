package org.example;

import org.example.c02controlFlow.calculate.C01_P27_Count_Positive_Negative_Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P27_Count_Positive_Negative_NumbersTest {
    @Test
    public void returnSumOfArrayWith5OddNumbers() {
        int[] array = new int[]{5,-4,10,15,-1};
        String result = C01_P27_Count_Positive_Negative_Numbers.countNumbersPositiveAndNegative(array);
        assertEquals("""
                Positive: 3
                Negative: 2
                """ , result);
    }
}