package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P37_Display_Reverse_NumberTest {
    @Test
    public void returnTheReverseOf8956() {
        String result = C03_P37_Display_Reverse_Number.reverseNumber(8956);
        assertEquals("6598", result);
    }
}