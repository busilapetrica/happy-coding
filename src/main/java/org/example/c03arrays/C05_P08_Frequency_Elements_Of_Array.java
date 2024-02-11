package org.example.c03arrays;
/******************************************************
 Write a program in java to count the frequency of each element of an array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 25
 element - 1 : 12
 element - 2 : 43
 Expected Output :
 The frequency of all elements of an array :
 25 occurs 1 times
 12 occurs 1 times
 43 occurs 1 times
********************************************/
public class C05_P08_Frequency_Elements_Of_Array {
    private C05_P08_Frequency_Elements_Of_Array () {}


    public static int[] countFrequency(int[] array) {
        int[] result = new int[array.length];
        if (array.length == 1) {
            result[0] = 1;
        } else if (array.length >= 2) {
            int[] counts = new int[array.length];
            counts[0] = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[0] == array[i]) {
                    counts[0]++;
                } else {
                    counts[i]++;
                }
            }
            int numberOfZeros = countZeros(counts);
            int[] countsWithoutZeros = getCountsWithoutZeros(counts, numberOfZeros);

            if (countsWithoutZeros.length == 1) {
                result = new int[]{countsWithoutZeros[0]};
            } else {
                result = countsWithoutZeros;
            }
        }
        return result;
    }

    private static int[] getCountsWithoutZeros(int[] counts, int numberOfZeros) {
        int[] countsWithoutZeros = new int[counts.length - numberOfZeros];
        int j = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                countsWithoutZeros[j] = counts[i];
                j++;
            }
        }
        return countsWithoutZeros;
    }

    private static int countZeros(int[] counts) {
        int numberOfZeros = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 0) {
                numberOfZeros++;
            }
        }
        return numberOfZeros;
    }
}

