package org.example.c02controlFlow.calculate;
/*****************************************************************************
 Write program in java to read 10 numbers from keyboard and first their sum and average.
 Input the 10 numbers:
 Input the -1 : 2
 ..............
 Input the -10 : 55
 *******************************************************************************/
public class SumAverageNumbers {
    private SumAverageNumbers() {}

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            sum += array[i];
        }
        double average;
        average = (double) sum / array.length;
        return average;
    }
}
