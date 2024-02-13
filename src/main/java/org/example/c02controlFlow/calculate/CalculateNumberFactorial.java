package org.example.c02controlFlow.calculate;
/******************************************************************************
 Write a program in java to calculate the factorial of given number
 Test data:
 input number:5
 Expected output:
 The factorial of 5 is : 120
 *******************************************************************************/
public class CalculateNumberFactorial {
    private CalculateNumberFactorial() {}

    public static int factorialNumber(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
