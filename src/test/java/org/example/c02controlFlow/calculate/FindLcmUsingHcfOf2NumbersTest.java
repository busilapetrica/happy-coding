package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.FindLcmUsingHcfOf2Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLcmUsingHcfOf2NumbersTest {
    @Test
    public void returnLeastCommonMultipleForNumbers15And20() {
        float result = FindLcmUsingHcfOf2Numbers.findLeastCommonMultiple(15, 20);
        assertEquals(60 , result);
    }

}