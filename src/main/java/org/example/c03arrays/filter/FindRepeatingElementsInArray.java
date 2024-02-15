package org.example.c03arrays.filter;

/******************************************************************************
 Write a program in java to find the two repeating elements in a given array.
 Expected Output :
 The given array is : 2 7 4 7 8 3 4
 The repeating elements are: 4 7
 *******************************************************************************/
public class FindRepeatingElementsInArray {
    private FindRepeatingElementsInArray() {
    }
    public static int[] findAndPrintRepeatingElements(int[] array) {
        int[] arrayRepeatingElements = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            boolean alreadyExists = false;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    //check if element exist in arrayRepeatingElements
                    for (int k = 0; k < arrayRepeatingElements.length; k++) {
                        if (array[i] == arrayRepeatingElements[k]) {
                            alreadyExists = true;
                        }
                    }

                    //if element not exist add to arrayRepeatingEmenets
                    if (!alreadyExists) {
                        arrayRepeatingElements[index++] = array[i];
                    }
                }
            }
        }
        //copy just repeating element to a new arrayResult
        int[] resultArray = new int[index];
        for (int l = 0; l < index; l++) {
            resultArray[l] = arrayRepeatingElements[l];
        }

        return resultArray;
    }
}

