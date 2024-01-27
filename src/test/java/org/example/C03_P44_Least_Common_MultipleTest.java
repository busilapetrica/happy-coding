package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P44_Least_Common_MultipleTest {
    @Test
    public void returnLeastCommonMultipleForNumbers15And20() {
        float result = C03_P44_Least_Common_Multiple.findLeastCommonMultiple(15, 20);
        assertEquals(60 , result);
    }

}