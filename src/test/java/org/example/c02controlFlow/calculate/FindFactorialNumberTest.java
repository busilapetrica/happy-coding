package org.example.c02controlFlow.calculate;
import org.example.c02controlFlow.calculate.FindFactorialNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindFactorialNumberTest {
    @Test
    void returnFactorialNumberOf5() {
        int result = FindFactorialNumber.findFactorial(5);
        assertEquals(120, result);
    }
}