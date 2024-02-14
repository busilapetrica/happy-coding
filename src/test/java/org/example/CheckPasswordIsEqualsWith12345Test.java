package org.example;

import org.example.c02controlFlow.validate.CheckPasswordIsEqualsWith12345;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordIsEqualsWith12345Test {
    @Test
     void returnTrueIfPasswordIsCorrectWith12345() {
        int password =12345;
        boolean result = CheckPasswordIsEqualsWith12345.checkpassword(password);
        assertEquals(true , result);
    }
    @Test
     void returnTrueIfPasswordIsNotCorrectWith12345() {
        int password =1234;
        boolean result = CheckPasswordIsEqualsWith12345.checkpassword(password);
        assertEquals(false , result);
    }

}