package org.example;
/******************************************************************************
 Write a program in java to calculate the factorial of given number
 Test data:
 input number:5
 Expected output:
 The factorial of 5 is : 120
 *******************************************************************************/
public class C03_P15_Number_Factorial {
    public static void main(String[] args) {
        int x = 5;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
