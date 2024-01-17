package org.example;

/*********************************************************
 Write a program in C to sort elements of an array in ascending order.
 Test Data :
 Input the size of array : 5
 Input 5 elements in the array :
 element - 0 : 2
 element - 1 : 7
 element - 2 : 4
 element - 3 : 5
 element - 4 : 9
 Expected Output :
 Elements of array in sorted ascending order:
 2 4 5 7 9
 ********************************************************/
public class C05_P11_Array_Sorting_Ascending_Order {
    public static int[] sortingArrayInAscendingOrder(int[] array){
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
        return array;
    }

}
