package org.example.c05recursion;
import org.example.c05recursion.FindFactorialNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindFactorialNumberTest {
    @Test
    void returnFactorialNumberOf5() {
        int result = FindFactorialNumber.findFactorial(5);
        assertEquals(120, result);
    }
}