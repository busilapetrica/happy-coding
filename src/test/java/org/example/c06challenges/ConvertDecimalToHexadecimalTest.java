package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//test for decimal 1, 11,12,13,14,15,16,17
class ConvertDecimalToHexadecimalTest {
    @Test
    void returnHexadecimalConvertedNumberOf1() {

        String result = ConvertDecimalToHexadecimal.convertToHexadecimal(1);
        assertEquals("1", result);
    }

    @Test
    void returnHexadecimalConvertedNumberOf11To17() {

        String result = ConvertDecimalToHexadecimal.convertToHexadecimal(11);
        assertEquals("B", result);

        result = ConvertDecimalToHexadecimal.convertToHexadecimal(12);
        assertEquals("C", result);

        result = ConvertDecimalToHexadecimal.convertToHexadecimal(13);
        assertEquals("D", result);

         result = ConvertDecimalToHexadecimal.convertToHexadecimal(14);
        assertEquals("E", result);

        result = ConvertDecimalToHexadecimal.convertToHexadecimal(15);
        assertEquals("F", result);

        result = ConvertDecimalToHexadecimal.convertToHexadecimal(16);
        assertEquals("10", result);

        result = ConvertDecimalToHexadecimal.convertToHexadecimal(17);
        assertEquals("11", result);

    }
}