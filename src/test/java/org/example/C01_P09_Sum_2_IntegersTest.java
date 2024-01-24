package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P09_Sum_2_IntegersTest {
    @Test
    public void returnSumOf2Integers() {
        int result = C01_P09_Sum_2_Integers.sumOf2Integers(4,7);
        assertEquals(11, result);
    }
}