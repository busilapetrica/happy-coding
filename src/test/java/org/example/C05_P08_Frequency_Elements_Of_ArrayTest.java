package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class C05_P08_Frequency_Elements_Of_ArrayTest {
        @Test
        public void FindFrequencyInNewLineListInArrayWithThreeElements() {
            int[] array = {25, 12, 43}; // Initial array1
            // Call logic
            String result = C05_P08_Frequency_Elements_Of_Array.findFrequencyElements(array);
            // Assert result
            assertEquals("""
                25 occurs 1 times
                12 occurs 1 times
                43 occurs 1 times
                """, result);
        }
    @Test
    public void FindFrequencyInNewLineListInArrayWithFourElements() {
        int[] array = {25, 12, 43, 43}; // Initial array1
        // Call logic
        String result = C05_P08_Frequency_Elements_Of_Array.findFrequencyElements(array);
        // Assert result
        assertEquals("""
                25 occurs 1 times
                12 occurs 1 times
                43 occurs 2 times
                """, result);
    }
    }

