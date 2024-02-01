package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C05_P44_Repeating_Elements_In_ArrayTest {
    @Test
    public void return2NumbersRepeatedInArray() {
        int[] array = new int[]{2, 7, 4, 7, 8, 7, 4};
        String result = C05_P44_Repeating_Elements_In_Array.findAndPrintRepeatingElements( array);
        assertEquals("4 7 ", result);
    }
}