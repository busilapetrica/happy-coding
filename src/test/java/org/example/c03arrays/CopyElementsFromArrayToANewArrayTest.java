package org.example.c03arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.example.c03arrays.transform.CopyElementsFromArrayToANewArray;
import org.junit.jupiter.api.Test;

class CopyElementsFromArrayToANewArrayTest {
    @Test
     void copyNumbersToCommaSeparatedList() {
        int[] array = {1, 1, 5, 3, 4, 5, 6, 7, 8, 9}; // Initial array
        // Call logic
        int[] result = CopyElementsFromArrayToANewArray.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{1, 1, 5, 3, 4, 5, 6, 7, 8, 9}, result);

    }

    @Test
     void copy3NumbersToCommaSpaceSeparatedList() {
        int[] array = {33, 42, 51}; // Initial array
        int[] result = CopyElementsFromArrayToANewArray.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{33, 42, 51},result);
    }

    @Test
     void copy2NumbersToCommaSpaceSeparatedList() {
        int[] array = {3, 4}; // Initial array
        int[] result = CopyElementsFromArrayToANewArray.copyToSecondArray(array);
        // Assert result
        assertArrayEquals(new int[]{3, 4}, result);
    }


}