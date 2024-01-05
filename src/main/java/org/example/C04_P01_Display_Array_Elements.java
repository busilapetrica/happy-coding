package org.example;

import java.util.Arrays;
import java.util.Scanner;
/******************************************************************************
 Write a program in java to store elements in an array and print them.
 Test Data :
 Input 10 elements in the array :
 element - 0 : 33
 element - 1 : 42
 element - 2 : 51
 .......
 Expected Output :
 Elements in array are: 33 42 51
 *******************************************************************************/
public class C04_P01_Display_Array_Elements {
    public static void main(String[] args) {
        System.out.println("Number of elements:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("element - " + i + " : ");
            array[i] = in.nextInt();
        }

        // Convert array to string
        String result = Arrays.toString(addElementsToArray(array));
        System.out.println(result);
    }

    public static int[] addElementsToArray(int[] array) {
        int[] result = new int[array.length];
        System.arraycopy(array, 0, result, 0, array.length);
        return result;
    }
}