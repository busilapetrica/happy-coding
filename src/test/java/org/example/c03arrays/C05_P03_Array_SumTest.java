package org.example.c03arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.c03arrays.calculate.C05_P03_Array_Sum;
import org.junit.jupiter.api.Test;
class C05_P03_Array_SumTest {
    @Test
        public void calculateSumNumbersFromArrayWith2Numbers() {
            int[] array = {1, 1};
            int result = C05_P03_Array_Sum.calculateArraySum(array);
            assertEquals(2, result);
    }
    @Test
    public void calculateSumNumbersFromArrayWith3Numbers() {
        int[] array = {1, 10, 18};
        int result = C05_P03_Array_Sum.calculateArraySum(array);
        assertEquals(29, result);
    }
    @Test
    public void calculateSumNumbersFromArrayWith4Numbers() {
        int[] array = {1, 55, 694, 7 };
        int result = C05_P03_Array_Sum.calculateArraySum(array);
        assertEquals(757, result);
    }
}