package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P22_Sum_Of_5_odd_numbersTest {
    @Test
    public void returnSumOfArrayWith5OddNumbers() {
        int[] array = new int[]{11,17,13,12,5};
        int result = C01_P22_Sum_Of_5_odd_numbers.calculateSumOddNumbers(array);
        assertEquals(46 , result);
    }

}