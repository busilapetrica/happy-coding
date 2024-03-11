package org.example.c06challenges;

/**************************************
 Write a program in java to find the smallest missing element in a sorted array.
 Expected Output :
 The given array is : 0 1 3 4 5 6 7 9
 The missing smallest element is: 2
 **********************************/

public class SmallestMissingElement {
    private SmallestMissingElement() {
    }

    public static int findSmallestMissingElement(int[] array) {
        int elementMissing = 0;


        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (elementMissing != array[i]) {
                return elementMissing;
            } else {

                elementMissing++;
            }
        }

        return elementMissing;
    }
}
