package org.example.c03arrays.transform;

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
public class DisplayArrayElements {
    private DisplayArrayElements() {}

    public static int[] addElementsToNewArray(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}