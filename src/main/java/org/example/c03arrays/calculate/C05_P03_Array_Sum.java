package org.example.c03arrays.calculate;

import java.util.Scanner;

/******************************************************************************
 Write a program in java to find the sum of all elements of the array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 2
 element - 1 : 5
 element - 2 : 8
 Expected Output :
 Sum of all elements stored in the array is : 15
 *******************************************************************************/

public class C05_P03_Array_Sum {
    private C05_P03_Array_Sum () {}


    public static int calculateArraySum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        return arraySum;
    }
}