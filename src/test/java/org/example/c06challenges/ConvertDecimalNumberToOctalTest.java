package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDecimalNumberToOctalTest {
    @Test
    void returnOctalConvertedNumberOf123() {
        int number = 123;
        int result = ConvertDecimalNumberToOctal.convertToOctal(number);
        assertEquals(173, result);
    }

    @Test
    void returnOctalConvertedNumberOf0() {
        int number = 0;
        int result = ConvertDecimalNumberToOctal.convertToOctal(number);
        assertEquals(0, result);
    }

    @Test
    void returnOctalConvertedNumberOf10() {
        int number = 10;
        int result = ConvertDecimalNumberToOctal.convertToOctal(number);
        assertEquals(12, result);
    }
}