
package org.example.c03arrays.search;

import org.example.c03arrays.search.CountFrequencyElementsOfArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CountFrequencyElementsOfArrayTest {

    @Test
    void givenEmptyArrayReturnEmptyArray() {
        int[] array = {};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void oneElementArrayReturnsFrequency1() {
        int[] array = {5};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    void twoSameElementsArrayReturnsFrequency2() {
        int[] array = {5, 5};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{2}, result);
    }


    @Test
    void threeSameElementsArrayReturnsFrequency3() {
        int[] array = {5, 5, 5};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{3}, result);
    }

    @Test
    void fourSameElementsArrayReturnsFrequency3() {
        int[] array = {5, 5, 5, 5};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{4}, result);
    }

    @Test
    void twoDifferentElementsArrayReturnsFrequency1ForEachElement() {
        int[] array = {5, 6};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{1, 1}, result);
    }

    @Test
    void threeDifferentElementsArrayReturnsFrequency1ForEachElement() {
        int[] array = {5, 6, 7};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{1, 1, 1}, result);
    }

    @Test
    void fourDifferentElementsArrayReturnsFrequency1ForEachElement() {
        int[] array = {5, 6, 7, 8};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

    @Test
    void duplicateElementAtTheBeginningOfArrayReturnsFrequency2OnFirstPosition() {
        int[] array = {5, 5, 6};

        int[] result = CountFrequencyElementsOfArray.countFrequency(array);

        assertEquals(Arrays.toString(new int[]{2, 1}), Arrays.toString(result));
    }
/*
    @Test
    void duplicateElementAtTheEndOfArrayReturnsFrequency2OnLastPosition() {
        int[] array = {5, 6, 6};

        int[] result = C05_P08_Frequency_Elements_Of_Array.countFrequency(array);

        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(result));
    }

*/
}
