package org.example.c03arrays.sort;

/****************************************8
 Write a java program to sort a list of elements using the selection sort algorithm. >
 According to Wikipedia "In computer science, selection sort is a sorting algorithm,
 specifically an in-place comparison sort. It has O(n2) time complexity, making it
 inefficient on large lists, and generally performs worse than the similar insertion sort".
 Note :
 a) To find maximum of elements
 b) To swap two elements
 ***************************************/
public class SortingSelectionAlgorithm {
    private SortingSelectionAlgorithm() {}

    public static int[] sorting(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // we find the smallest number from our sublist
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // we make swap with the first number from our list
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        return array;
    }
}
