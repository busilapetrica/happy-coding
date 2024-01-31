package org.example;

/****************************************************8
 Write a program in java to insert the values in the array (sorted list).
 Test Data :
 Insert New value in the sorted array :
 -----------------------------------------
 Input the size of array : 5
 Input 5 elements in the array in ascending order:
 element - 0 : 2
 element - 1 : 5
 element - 2 : 7
 element - 3 : 9
 element - 4 : 11
 Input the value to be inserted : 8
 The exist array list is :
 2 5 7 9 11
 After Insert the list is :
 2 5 7 8 9 11
 */
public class C05_P13_Add_New_Element_To_Array {
    private C05_P13_Add_New_Element_To_Array() {
    }

    public static int[] addElementToArray(int[] array, int newElement) {

        if (array.length == 0) {
            int[] newArray = new int[1];
            newArray[0] = newElement;
            return newArray;
        } else {
            int[] newArray = new int[array.length + 1];
            int newIndex = 0;
            boolean inserted = false;

            for (int i = 0; i < array.length; i++) {
                if (!inserted && array[i] >= newElement) {
                    newArray[newIndex++] = newElement;
                    inserted = true;
                }
                newArray[newIndex++] = array[i];
            }
            if (!inserted) {
                newArray[newIndex] = newElement;
            }
            return newArray;
        }
    }
}
