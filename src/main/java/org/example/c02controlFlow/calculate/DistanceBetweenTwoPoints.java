package org.example.c02controlFlow.calculate;

import static java.lang.Math.sqrt;

/************************************************
 Write a java program to calculate the distance between two points.
 Test Data :
 Input x1: 25
 Input y1: 15
 Input x2: 35
 Input y2: 10
 Expected Output:
 Distance between the said points: 11.1803
 ************************************************/
public class DistanceBetweenTwoPoints {
    private DistanceBetweenTwoPoints() {
    }
    public static double calculateDistance(double inputX1, double inputX2, double inputY1, double inputY2) {
        double sqrt = 10000*(sqrt(((inputX2 - inputX1) * (inputX2 - inputX1))
                + ((inputY2 - inputY1) * (inputY2 - inputY1))));

        int distance = (int) sqrt;

        return   distance / 10000.0;
    }
}
