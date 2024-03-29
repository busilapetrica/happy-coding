package org.example.c01operators;

import org.example.c01operators.ConvertDaysToYearsWeeksAndDays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertDaysToYearsWeeksAndDaysTest {

    @Test
    void returnConvertedDaysToTotalYearsDaysAndDaysSeparatedWithComma() {
        String result = ConvertDaysToYearsWeeksAndDays.convertDays(365);
        assertEquals("1, 0, 0", result);
    }
}