package org.example;

public class C05_P12_Array_Sorting_Descending_Order {
    private C05_P12_Array_Sorting_Descending_Order () {}

    public static int[] sortingArrayInDescendingOrder(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
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
