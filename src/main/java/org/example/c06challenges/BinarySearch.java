package org.example.c06challenges;

public class BinarySearch {
    public static int binarySearch(int[] array, int searchedNumber) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];

            if (midVal == searchedNumber) {
                return mid;
            } else if (midVal < searchedNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; 
    }
}
