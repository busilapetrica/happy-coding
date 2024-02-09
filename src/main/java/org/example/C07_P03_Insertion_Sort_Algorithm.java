package org.example;

/********************************************
 Write a java program to sort a list of elements using the insertion sort algorithm. >
 Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 It is much less efficient on large lists than other algorithms such as quicksort, heapsort, or merge sort.
 */
public class C07_P03_Insertion_Sort_Algorithm {

    private C07_P03_Insertion_Sort_Algorithm() {
    }

    public static int[] sortArray(int[] array) {
        for (int i = 1, j; i < array.length; i++) {
            int currentValue = array[i];
            for (j = i - 1; j >= 0 && array[j] > currentValue; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = currentValue;
        }
        return array;
    }
}