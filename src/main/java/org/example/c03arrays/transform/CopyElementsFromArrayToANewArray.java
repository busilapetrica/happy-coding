package org.example.c03arrays.transform;

/******************************************************************************
 Write a program in java to copy the elements of one array into another array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 15
 element - 1 : 10
 element - 2 : 12
 Expected Output :
 The elements stored in the first array are :
 15 10 12
 The elements copied into the second array are :
 15 10 12
 *******************************************************************************/
public class CopyElementsFromArrayToANewArray {
    private CopyElementsFromArrayToANewArray() {}


    public static int[] copyToSecondArray(int[] array) {
        //copy array to a new array
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }
}

