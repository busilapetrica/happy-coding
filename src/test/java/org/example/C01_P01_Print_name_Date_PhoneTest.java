package org.example;

import org.example.c02controlFlow.validate.C01_P01_Print_name_Date_Phone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P01_Print_name_Date_PhoneTest {
    @Test
    public void returnAStringWithNameDateAndPhoneNumberCommaSeparated() {
        String result = C01_P01_Print_name_Date_Phone.printDates("Petrica", "08.12.1986", "0724567");
        assertEquals("Petrica, 08.12.1986, 0724567", result);
    }
}