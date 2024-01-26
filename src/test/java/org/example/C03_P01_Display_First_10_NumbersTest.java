package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P01_Display_First_10_NumbersTest {
    @Test
    public void returnRowDisplayedWithSpaceFrom0ToNumber() {
        String result = C03_P01_Display_First_10_Numbers.loopTheNumbers(3);
        assertEquals("1 2 3 4 5 6 7 8 9 10 ", result);
    }

}