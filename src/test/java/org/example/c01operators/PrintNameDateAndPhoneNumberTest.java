package org.example.c01operators;

import org.example.c01operators.PrintNameDateAndPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNameDateAndPhoneNumberTest {
    @Test
     void returnAStringWithNameDateAndPhoneNumberCommaSeparated() {
        String result = PrintNameDateAndPhoneNumber.printDates("Petrica", "08.12.1986", "0724567");
        assertEquals("Petrica, 08.12.1986, 0724567", result);
    }
}