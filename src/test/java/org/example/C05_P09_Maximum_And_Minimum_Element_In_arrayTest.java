package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class C05_P09_Maximum_And_Minimum_Element_In_arrayTest {
    @Test
    public void findMaximAndMinimInArrayWith2Elements() {
        int[] array = {1, 3, 2}; // Initial array1
        // Call logic
        int[] result = C05_P09_Maximum_And_Minimum_Elements_In_Array.find_maxim_and_minim_elements(array);
        // Assert result
        assertArrayEquals(new int[] {1, 3}, result);
    }
    @Test
    public void findMaximAndMinimInArrayWith4Elements() {
        int[] array = {5, 90, 54, 10}; // Initial array1
        // Call logic
        int[] result = C05_P09_Maximum_And_Minimum_Elements_In_Array.find_maxim_and_minim_elements(array);
        // Assert result
        assertArrayEquals(new int[] {5, 90}, result);
    }
}