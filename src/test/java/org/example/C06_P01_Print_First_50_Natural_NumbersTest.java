package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C06_P01_Print_First_50_Natural_NumbersTest {
    @Test
    public void returnPrintedFirst50NaturalNumbersSeparatedBySpaces() {
        int startNumber = 1;
        String result = C06_P01_Print_First_50_Natural_Numbers.print50NaturalNumbers(startNumber);
        assertEquals("1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 " +
                "21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 " +
                "41 42 43 44 45 46 47 48 49 50", result);
    }

}