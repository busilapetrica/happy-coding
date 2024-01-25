package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P24_Integer_MultipliedTest {
    @Test
    public void returnIf2NumbersAreMultiplied() {
        int number1 =5;
        int number2 = 15;
        String result = C01_P24_Integer_Multiplied.checkMultipliedInt(number1, number2);
        assertEquals("Multiplied!" , result);
    }
    @Test
    public void returnIf2NumbersAreNotMultiplied() {
        int number1 =14;
        int number2 = 5;
        String result = C01_P24_Integer_Multiplied.checkMultipliedInt(number1, number2);
        assertEquals("Not Multiplied!" , result);
    }

}