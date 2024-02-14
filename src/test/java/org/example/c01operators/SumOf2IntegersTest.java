package org.example.c01operators;

import org.example.c01operators.SumOf2Integers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOf2IntegersTest {
    @Test
    void returnSumOf2Integers() {
        int result = SumOf2Integers.sumOf2Integers(4, 7);
        assertEquals(11, result);
    }
}