package org.example;

import org.example.c02controlFlow.validate.PrintNameDateAndPhoneNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintNameDateAndPhoneNumberTest {
    @Test
     void returnAStringWithNameDateAndPhoneNumberCommaSeparated() {
        String result = PrintNameDateAndPhoneNumber.printDates("Petrica", "08.12.1986", "0724567");
        assertEquals("Petrica, 08.12.1986, 0724567", result);
    }
}