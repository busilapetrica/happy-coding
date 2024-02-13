package org.example;

import org.example.c02controlFlow.calculate.MaximumOfThreeIntegers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _Maximum_Of_ThreeIntegersTest {
    @Test
    public void returnMaximumOfThreeIntegersWhenFistIsBigger() {
        int result = MaximumOfThreeIntegers.findMaximOf3Integers(5,3,1);
        assertEquals(5 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenSecondIsBigger() {
        int result = MaximumOfThreeIntegers.findMaximOf3Integers(3,7,2);
        assertEquals(7 , result);
    }
    @Test
    public void returnMaximumOfThreeIntegersWhenThirdIsBigger() {
        int result = MaximumOfThreeIntegers.findMaximOf3Integers(4,6,9);
        assertEquals(9 , result);
    }

    @Test
    public void returnMaximumOfThreeIntegersWhenAll3AreEquals() {
        int result = MaximumOfThreeIntegers.findMaximOf3Integers(4,4,4);
        assertEquals(4 , result);
    }

}