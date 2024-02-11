package org.example;

import org.example.c01operators.DistanceBetweenTwoPoints;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointsTest {
    @Test
    public void returnDistanceBetween2Points() {
        String result = DistanceBetweenTwoPoints.calculateDistance(25,35,15, 10);
        assertEquals("11.1803" , result);
    }

}