package org.example;

import static java.lang.Math.sqrt;

public class C01_P15_Distance_Between_Two_Points {
    /*Write a java program to calculate the distance between two points.
Test Data :
Input x1: 25
Input y1: 15
Input x2: 35
Input y2: 10
Expected Output:
Distance between the said points: 11.1803 */
    public static void main(String[] args){
        int input_x1 = 25, input_y1 = 15, input_x2 = 35, input_Y2 = 10;
       float distance = ((input_x2-input_x1)*(input_x2-input_x1))+((input_Y2-input_y1)*(input_Y2-input_y1));
        System.out.printf("Average consumption (km/lt) = %.4f", sqrt(distance));
    }
}
