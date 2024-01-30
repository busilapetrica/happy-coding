package org.example;
/******************************************************************************
 Write a program in java to rotate an array by N positions.
 Expected Output :
 The given array is : 0 3 6 9 12 14 18 20 22 25 27
 From 4th position the values of the array are : 12 14 18 20 22 25 27
 Before 4th position the values of the array are : 0 3 6 9
 After rotating from 4th position the array is:
 12 14 18 20 22 25 27 0 3 6 9
 *******************************************************************************/
public class C05_P39_Rotate_Elements_Array {
    public static int[] rotateArray(int[] array, int rotatePosition) {
        int[] arrayRotated = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i < rotatePosition) {
                arrayRotated[i + array.length - rotatePosition] = array[i];
            } else {
                arrayRotated[i - rotatePosition] = array[i];
            }
        }
        return arrayRotated;
    }
}



