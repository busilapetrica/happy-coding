package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P13_Maximum_Of_ThreeTest {
    @Test
    public void returnMaximumOfThreeIntegersWhenFistIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(5,3,1);
        assertEquals(5 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenSecondIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(3,7,2);
        assertEquals(7 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenThirdIsBigger() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(4,6,9);
        assertEquals(9 , result);
    }

    @Test
    public void returnMaximumOfThreeIntegersWhenAll3AreEquals() {
        int result = C01_P13_Maximum_Of_Three.findMaximOf3Integers(4,4,4);
        assertEquals(4 , result);
    }

}