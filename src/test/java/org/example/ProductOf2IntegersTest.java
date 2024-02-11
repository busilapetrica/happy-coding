package org.example;
import org.example.c01operators.ProductOf2Integers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductOf2IntegersTest {
    @Test
    public void returnProductOf2Integers() {
        int result = ProductOf2Integers.productOf2Integers(5,6);
        assertEquals(30, result);
    }

}