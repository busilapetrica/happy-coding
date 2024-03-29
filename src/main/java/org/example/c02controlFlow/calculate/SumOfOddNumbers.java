package org.example.c02controlFlow.calculate;
/*****************************************************************************
 Write a java program to display the n terms of odd natural numbers and their sun
 Test Data
 Input number of terms : 10
 Expect output
 The odd numbers are :  1 3 5 7 9 11 13 15 17 19
 *7******************************************************************************/
public class SumOfOddNumbers {
    private SumOfOddNumbers() {}

    public static String displayOddNumbersAndSum(int number) {
        int sum = 0;
        String result = "";
        for (int i = 1; i <= 2 * number; i += 2) {
            sum += i;
                result += i + " ";
        }
        return (result +"," + sum);
    }
}
