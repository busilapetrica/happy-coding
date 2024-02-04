package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C06_P10_Factorial_NumberTest {
    @Test
    public void returnFactorialNumberOf5() {
        int result = C06_P10_Factorial_Number.findFactorial(5);
        assertEquals(120, result);
    }
}