package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P13_Maximum_Of_ThreeTest {
    @Test
    public void returnMaximumOfThreeIntegersWhenFistIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(7,6,5);
        assertEquals(7 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenSecondIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(6,7,5);
        assertEquals(7 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenThirdIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(5,6,7);
        assertEquals(7 , result);
    }

}