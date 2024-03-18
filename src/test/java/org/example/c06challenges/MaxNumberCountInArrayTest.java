package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumberCountInArrayTest {
    @Test
    void returnRepeatedElementFromArrayAreEqualsWith7() {
        int[] array = {1, 7, 3, 7, 4, 3, 7, 3, 7};
        int result = MaxNumberCountInArray.majorityElementOfArray(array);
        assertEquals(7, result);
    }

    @Test
    void returnZeroIfInArrayAreNotRepeatedElements() {
        int[] array = {1, 2};
        int result = MaxNumberCountInArray.majorityElementOfArray(array);
        assertEquals(0, result);
    }

    @Test
    void returnZeroIfArrayIsEmpty() {
        int[] array = {};
        int result = MaxNumberCountInArray.majorityElementOfArray(array);
        assertEquals(0, result);
    }

}