package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P15_Distance_Between_Two_PointsTest {
    @Test
    public void returnDistanceBetween2Points() {
        String result = C01_P15_Distance_Between_Two_Points.calculateDistance(25,35,15, 10);
        assertEquals("11.1803" , result);
    }

}