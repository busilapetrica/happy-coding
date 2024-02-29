package org.example.c03arrays.sort;

/**********************************************************
 Write a java program to sort a list of elements using the quick sort algorithm. >
 Quick sort is a comparison sort, meaning that it can sort items of any type for which a "less-than"
 relation (formally, a total order) is defined.
 Note: Read n values into array and Sort using Quick Sort
 **********************************************************/
public class QuickSortAlgorithm {
    private QuickSortAlgorithm() {
    }

    static int[] quickSort(int arr[]) {
        return quickSortRecursive(arr, 0, arr.length - 1);
    }

    static int[] quickSortRecursive(int[] array, int low, int high) {

        if (low < high) {
            int pivot = array[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (array[j] < pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partitionIndex = i + 1;

            quickSortRecursive(array, low, partitionIndex - 1);
            quickSortRecursive(array, partitionIndex + 1, high);
        }

        return array;
    }
}