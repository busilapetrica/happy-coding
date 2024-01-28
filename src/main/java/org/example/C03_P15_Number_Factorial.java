package org.example;
/******************************************************************************
 Write a program in java to calculate the factorial of given number
 Test data:
 input number:5
 Expected output:
 The factorial of 5 is : 120
 *******************************************************************************/
public class C03_P15_Number_Factorial {
    private C03_P15_Number_Factorial () {}

    public static int factorialNumber(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
