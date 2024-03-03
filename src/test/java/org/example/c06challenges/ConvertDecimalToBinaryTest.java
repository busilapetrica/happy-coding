package org.example.c06challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDecimalToBinaryTest {
    @Test
    void returnBinaryConvertedNumberOf1() {

        long result = ConvertDecimalToBinary.convertNumberToBinary(1);
        assertEquals(1, result);
    }
    @Test
    void returnBinaryConvertedNumberOf2() {
        int number = 2;
        long result = ConvertDecimalToBinary.convertNumberToBinary(2);
        assertEquals(10, result);
    }
    @Test
    void returnBinaryConvertedNumberOf3() {
        int number = 2;
        long result = ConvertDecimalToBinary.convertNumberToBinary(3);
        assertEquals(11, result);
    }

}