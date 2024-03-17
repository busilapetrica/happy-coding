package org.example.c06challenges;

public class MaxNumberCountInArray {
    private MaxNumberCountInArray() {
    }

    public static int majorityElementOfArray(int[] array) {
        int maxFreqNumber = 0 ;
        int maxCount = 0 ;

        if (array.length == 0) {
            return maxFreqNumber;
        } else {

            for (int i = 0; i < array.length; i++) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {

                    if (array[i] == array[j] && i != j) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxFreqNumber = array[i];
                }
            }
        }
        return maxFreqNumber;
    }
}
