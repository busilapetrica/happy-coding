package org.example.c02controlFlow.generate;

import org.example.c02controlFlow.generate.PrintFirst10Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintFirst10NumbersTest {
    @Test
     void returnRowDisplayedWithSpaceFrom0ToNumber() {
        String result = PrintFirst10Numbers.loopTheNumbers(3);
        assertEquals("1 2 3 4 5 6 7 8 9 10 ", result);
    }

}