package org.example;

/***************************************
 Write a program in java to insert values in the array (unsorted list).
 Test Data :
 Input the size of array : 4
 Input 4 elements in the array in ascending order:
 element - 0 : 1
 element - 1 : 8
 element - 2 : 7
 element - 3 : 10
 Input the value to be inserted : 5
 Input the Position, where the value to be inserted :2
 Expected Output :
 The current list of the array :
 1 8 7 10
 After Insert the element the new list is :
 1 5 8 7 10
 ********************************************/
public class C05_P14_Add_New_Element_To_Unsorted_Array {
    private C05_P14_Add_New_Element_To_Unsorted_Array () {}

    public static int[] addElementToArray(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1];

        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < 1) {
                newArray[newIndex++] = array[i];
            } else {
                // Always add the new element after any equal or greater elements
                newArray[newIndex++] = newElement;
                // Copy the remaining elements
                while (i < array.length) {
                    newArray[newIndex++] = array[i++];
                }
                break;
            }
        }
        return newArray;
    }
}

