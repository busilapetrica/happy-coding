package org.example;

public class C05_P16_Second_Largest_Number_In_Array {
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

