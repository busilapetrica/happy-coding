package org.example;

import org.example.c03arrays.calculate.C05_P32_Sum_Pair_In_Array;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P32_Sum_Pair_In_ArrayTest {
    @Test
    public void returnElementsOfGivenPairSum() {
        int[] array = new int[]{6, 8, 4, -5, 7, 9};
        int pairSum=15;

        String result = C05_P32_Sum_Pair_In_Array.findPairValueSum(array, pairSum);
        assertEquals("0 and 5", result);
    }

}