package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static int[] uniqueElementsFromArray(int[] array) {
        String result = "";
        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueList.add(array[i]);
            }
        }

        // Convert the List to an array
        int[] uniqueArray = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        // Build the result string
        for (int i = 0; i < uniqueArray.length; i++) {
            result += uniqueArray[i];
            if (i < uniqueArray.length - 1) {
                result += ", ";
            }
        }

        return null;
    }

}
