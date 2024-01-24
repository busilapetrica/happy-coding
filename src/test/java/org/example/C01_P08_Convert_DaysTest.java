package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P08_Convert_DaysTest {

    @Test
    public void returnConvertedDaysToTotalYearsDaysAndDaysSeparatedWithComma() {
        String result = C01_P08_Convert_Days.convertDays(365);
        assertEquals("1, 0, 0", result);
    }
}