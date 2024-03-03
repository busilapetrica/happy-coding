package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDecimalToBinaryTest {
    @Test
    void returnBinaryConvertedNumberOf65() {
        int number = 65;
        long result = ConvertDecimalToBinary.convertNumberToBinary(number);
        assertEquals(1000001, result);
    }

}