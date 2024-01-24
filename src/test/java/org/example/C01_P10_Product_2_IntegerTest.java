package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P10_Product_2_IntegerTest {
    @Test
    public void returnProductOf2Integers() {
        int result = C01_P10_Product_2_Integer.productOf2Integers(5,6);
        assertEquals(30, result);
    }

}