package org.example.c03arrays.filter;
/*************************************************************
WWrite a program in java to find the maximum and minimum elements in an array.
Test Data :
Input the number of elements to be stored in the array :3
Input 3 elements in the array :
element - 0 : 45
element - 1 : 25
element - 2 : 21
Expected Output :
Maximum element is : 45
Minimum element is : 21
 ***********************************************************/
public class FindMaximumAndMinimumElementsInArray {
    private FindMaximumAndMinimumElementsInArray() {}

    public static int[] findMaximAndMinimElements(int[] array){
            int[] arrayMinimumAndMaximum = new int[2];
            //the method name is bubbleSort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        arrayMinimumAndMaximum[0] = array[0];
        arrayMinimumAndMaximum[1] = array[array.length - 1];

        return arrayMinimumAndMaximum;
    }
}
