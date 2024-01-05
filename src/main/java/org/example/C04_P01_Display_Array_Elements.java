package org.example;
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
        
        String result = addElementsToArray(array);
        System.out.println(result);
    }

    public static String addElementsToArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i < array.length - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}