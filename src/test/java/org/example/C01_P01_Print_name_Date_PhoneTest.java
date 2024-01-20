package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P01_Print_name_Date_PhoneTest {
    @Test
    public void floydTriangleWithHeight1(){

        String floydTriangle = C01_P01_Print_name_Date_Phone.printDates("Petrica", "08.12.1986", "0724567");
        assertEquals("Name : Petrica  Date Birth : 08.12.1986 Phone number : 0724567", floydTriangle);
    }
}