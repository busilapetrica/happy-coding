package org.example.c03arrays.calculate;

import org.example.c03arrays.calculate.CalculateElementsPairEqualsWithSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateElementsPairEqualsWithSumTest {
    @Test
    void returnElementsOfGivenPairSum() {
        int[] array = new int[]{6, 8, 4, -5, 7, 9};
        int pairSum = 15;

        String result = CalculateElementsPairEqualsWithSum.findPairValueSum(array, pairSum);
        assertEquals("0 and 5", result);
    }

}