package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindLcmUsingHcfOf2NumbersTest {
    @Test
    public void returnLeastCommonMultipleForNumbers15And20() {
        float result = FindLcmUsingHcfOf2Numbers.findLeastCommonMultiple(15, 20);
        assertEquals(60 , result);
    }

}