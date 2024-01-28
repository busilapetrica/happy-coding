package org.example;

import java.util.Arrays;
/******************************************************************************
 Write a program in java to count the total number of duplicate elements in an array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 5
 element - 1 : 1
 element - 2 : 1
 Expected Output :
 Total number of duplicate elements found in the array is : 1
 *******************************************************************************/
public class C05_P05_Duplicates_In_Array {
    private C05_P05_Duplicates_In_Array () {}


    public static int findDuplicateInArray(int[] array) {
        int count = 0;
        // Sort the array in ascending order
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
                // Skip over the remaining duplicates
                while (i < array.length - 1 && array[i] == array[i + 1]) {
                    i++;
                }
            }
        }
        return count;
    }
}
