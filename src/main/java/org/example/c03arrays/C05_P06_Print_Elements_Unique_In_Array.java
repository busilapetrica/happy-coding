package org.example.c03arrays;
/******************************************************************************
 Input the number of elements to be stored in the array: 4
 Input 4 elements in the array :
 element - 0 : 3
 element - 1 : 2
 element - 2 : 2
 element - 3 : 5
 Expected Output :
 The unique elements found in the array are:
 3 5
 *****************************************************************************/
public class C05_P06_Print_Elements_Unique_In_Array {
    private C05_P06_Print_Elements_Unique_In_Array () {}

 public static int[] uniqueElementsFromArray(int[] array) {
        int count = 0;
        // Count the number of unique elements
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                count++;
            }
        }
        // Create a new array to store unique elements
        int[] newArray = new int[count];
        count = 0;
        // Populate the new array with unique elements
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                newArray[count++] = array[i];
            }
            // Skip duplicates
            while (i < array.length - 1 && array[i] == array[i + 1]) {
                i++;
            }
        }
   // Resize the array to the actual count of unique elements
        int[] resizedArray = new int[count];
        for (int i = 0; i < count; i++) {
            resizedArray[i] = newArray[i];
        }

        return resizedArray;
    }
}
