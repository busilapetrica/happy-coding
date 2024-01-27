package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P39_Number_Divisible_With_NineTest {
    @Test
    public void returnNumbersDivisibleWith9() {
        int fromNumber =100;
        int toNumber = 200;
        int divNumber = 9;
        String result = C03_P39_Number_Divisible_With_Nine.sumNumbersDivided(fromNumber, toNumber, divNumber);
        assertEquals("108 117 126 135 144 153 162 171 180 189 198 " , result);
    }
}