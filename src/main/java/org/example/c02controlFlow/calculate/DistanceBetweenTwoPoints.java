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
    private DistanceBetweenTwoPoints() {}

    public static String calculateDistance(int input_x1, int input_x2, int input_y1, int input_y2) {
        float distance = ((input_x2 - input_x1)*(input_x2 - input_x1))+((input_y2 - input_y1)*(input_y2 - input_y1));
       return (String.format("%.4f", sqrt(distance)));
    }
}
