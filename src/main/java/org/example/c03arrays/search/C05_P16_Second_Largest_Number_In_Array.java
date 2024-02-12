package org.example.c03arrays.search;
/*********************************************
 Write a program in java to find the second largest element in an array.
 Test Data :
 Input the size of array : 5
 Input 5 elements in the array :
 element - 0 : 2
 element - 1 : 9
 element - 2 : 1
 element - 3 : 4
 element - 4 : 6
 Expected Output :
 The Second largest element in the array is : 6
 ********************************************/
public class C05_P16_Second_Largest_Number_In_Array {
    private C05_P16_Second_Largest_Number_In_Array () {}

    public static int findSecondLargestElement(int[] array) {

        if (array.length == 2) {
            if (array[0] > array[1]) {
                return array[1];
            } else {
                return array[0];
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] < array[j + 1]) {

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array[1];
        }
    }
}

