package org.example.c02controlFlow.calculate;
/******************************************************************************
 Write a program in java to display the sum of n terms of even natural numbers.
 Test data:
 5
 Even numbers are :  2 4 6 8 10
 The sum : 30
 *******************************************************************************/
public class SumOfEvenNumbers {
    private SumOfEvenNumbers() {}

    public static int sumEvenNumbers(int numbers) {
        int result = 0;
        for (int i = 0; i <= numbers * 2; i += 2) {
            result += i;
        }
        return result;
    }
}
