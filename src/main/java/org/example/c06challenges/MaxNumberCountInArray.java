package org.example.c06challenges;

public class MaxNumberCountInArray {
    private MaxNumberCountInArray() {
    }

    public static int majorityElementOfArray(int[] array) {
        int arrayLength = array.length;
        int max_count = 0;
        int maxFreqNumber = -1;

        if (arrayLength == 0) {
            return 0;
        } else {

            for (int i = 0; i < arrayLength; i++) {
                int count = 0;
                for (int j = 0; j < arrayLength; j++) {

                    if (array[i] == array[j]) {
                        count++;
                    }
                }
                if (count > max_count) {
                    max_count = count;
                    maxFreqNumber = array[i];
                }
            }
        }
        return maxFreqNumber;
    }
}
