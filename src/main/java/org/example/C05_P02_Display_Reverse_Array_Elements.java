package org.example;

import java.util.Scanner;

/******************************************************************************
 Write a program in java to read n number of values in an array and display them in reverse order.
 Test Data :
 Input the number of elements to store in the array :3
 Input 3 number of elements in the array :
 element - 0 : 2
 element - 1 : 5
 element - 2 : 7
 Expected Output :
 The values store into the array are :
 2 5 7
 The values store into the array in reverse are :
 7 5 2
 *******************************************************************************/
public class C05_P02_Display_Reverse_Array_Elements {

    public static int[] arrayToStringRevers(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            stringBuilder.append(array[i - 1]);
            if (i > 1) {
                stringBuilder.append(", ");
            }
        }
        //return stringBuilder.toString();
        return null;
    }
}
