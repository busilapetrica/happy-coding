package org.example.c06challenges;
/******************************************************************************
 Write a program in java to find the largest sum of contiguous subarrays in an array.

 The given array is :  8  3  8  -5  4  3  -4  3  5
 The largest sum of contiguous subarray is : 25
 *******************************************************************************/
public class LargestSumOfConsecutiveSubArrays {
    private LargestSumOfConsecutiveSubArrays() {
    }

    public static int findMaxSumOfNumbersConsecutive(int[] array){
        int maxSumSoFar = array[0];
        int maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = maxEndingHere + array[i];

            if (array[i] > maxEndingHere) {
                maxEndingHere = array[i];
            }

            if (maxEndingHere > maxSumSoFar) {
                maxSumSoFar = maxEndingHere;
            }
        }

        return maxSumSoFar;
    }

}
