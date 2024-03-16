package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestMissingElementTest {
    @Test
    void return2SmallestMissingElementInArray() {
        int[] array = {7, 4, 1, 9, 5, 8, 3, 6};
        int result = SmallestMissingElement.findSmallestMissingElement(array);
        assertEquals(2, result);
    }

    @Test
    void return0SmallestMissingElementIfArrayIsEmpty() {
        int[] array = {};
        int result = SmallestMissingElement.findSmallestMissingElement(array);
        assertEquals(0, result);
    }

    @Test
    void return0SmallestMissingElementInArray() {
        int[] array = {2, 4, 1, 3, 5, 7, 9, 6};
        int result = SmallestMissingElement.findSmallestMissingElement(array);
        assertEquals(8, result);
    }
}