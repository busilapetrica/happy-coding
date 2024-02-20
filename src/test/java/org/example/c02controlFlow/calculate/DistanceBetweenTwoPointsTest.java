package org.example.c02controlFlow.calculate;

import org.example.c02controlFlow.calculate.DistanceBetweenTwoPoints;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointsTest {
    @Test
    void returnDistanceBetween2Points() {
        double result = DistanceBetweenTwoPoints.calculateDistance(25, 35, 15, 10);
        assertEquals(11.1803, result);
    }

}