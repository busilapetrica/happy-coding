package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C04_P36_Check_PasswordTest {
    @Test
    public void returnTrueIfPasswordIsCorrectWith12345() {
        int password =12345;
        boolean result = C04_P36_Check_Password.checkpassword(password);
        assertEquals(true , result);
    }
    @Test
    public void returnTrueIfPasswordIsNotCorrectWith12345() {
        int password =1234;
        boolean result = C04_P36_Check_Password.checkpassword(password);
        assertEquals(false , result);
    }

}