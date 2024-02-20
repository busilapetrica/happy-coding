package org.example.c03arrays.delete;

/***************************************
 15. Write a program in java to delete an element at a desired position from an array.
 Test Data :
 Input the size of array : 5
 Input 5 elements in the array in ascending order:
 element - 0 : 1
 element - 1 : 2
 element - 2 : 3
 element - 3 : 4
 element - 4 : 5
 Input the position where to delete: 3
 Expected Output :
 The new list is : 1 2 4 5
 ********************************************/
public class DeleteElementFromArray {
    private DeleteElementFromArray() {}

    public static int[] deleteElementFromArray(int[] array, int positionToDelete) {

        int[] newArray = new int[array.length - 1];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != positionToDelete - 1) {
                newArray[newIndex++] = array[i];
            }
        }
        return newArray;
    }
}
