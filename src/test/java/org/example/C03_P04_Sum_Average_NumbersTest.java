package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P04_Sum_Average_NumbersTest {
    @Test
    public void returnSumNumbers() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int result = C03_P04_Sum_Average_Numbers.calculateSum(array);
        assertEquals(54, result);
    }

    @Test
    public void returnAverageNumbers() {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        double result = C03_P04_Sum_Average_Numbers.calculateAverage(array);
        assertEquals(5.4, result);
    }

}