package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDecimalToHexadecimalTest {
    @Test
    void returnHexadecimalConvertedNumberOf79() {
        int number = 79;
        String result = ConvertDecimalToHexadecimal.convertToHexadecimal(number);
        assertEquals("4F", result);
    }

    @Test
    void returnHexadecimalConvertedNumberOf0() {
        int number = 0;
        String result = ConvertDecimalToHexadecimal.convertToHexadecimal(number);
        assertEquals("0", result);
    }

}