package org.example.c03arrays.transform;

import java.util.Arrays;

/*****************************************************
 Write a program in C to merge two arrays of the same size sorted in descending order.
 Test Data :
 Input the number of elements to be stored in the first array :3
 Input 3 elements in the array :
 element - 0 : 1
 element - 1 : 2
 element - 2 : 3
 Input the number of elements to be stored in the second array :3
 Input 3 elements in the array :
 element - 0 : 1
 element - 1 : 2
 element - 2 : 3
 Expected Output :
 The merged array in decending order is :
 3, 3, 2, 2, 1, 1
 *****************************************************/
public class ArrayMergeSortedDescending {
    private ArrayMergeSortedDescending() {}


    public static int[] mergeArraysAndSorting(int[] array1, int[] array2) {
        int arraysLength = array1.length + array2.length;
        int[] arrayMerge = new int[arraysLength];

        // Copy elements from array1
        for (int i = 0; i < array1.length; i++) {
            arrayMerge[i] = array1[i];
        }

        // Copy elements from array2
        for (int i = 0; i < array2.length; i++) {
            arrayMerge[array1.length + i] = array2[i];
        }

        return makeReverseStringFromArray(arrayMerge);
    }

    public static int[] makeReverseStringFromArray(int[] array) {
        Arrays.sort(array);
        int[] reverseArray = new int[array.length];
// Build the result reverse array
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }
}