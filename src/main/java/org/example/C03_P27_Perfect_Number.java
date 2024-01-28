package org.example;
/*************************************************
 Write a java program to check whether a given number is a 'Perfect' number or not.
 Test Data :
 Input the number : 56
 Expected Output :
 The positive divisor : 1 2 4 7 8 14 28
 The sum of the divisor is : 64
 So, the number is not perfect.
 *************************************************/
public class C03_P27_Perfect_Number {
    private C03_P27_Perfect_Number () {}

    public static boolean findPerfectNumber(int number) {
        int divisor_sum = 0;
        boolean result;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisor_sum += i;
            }
        }
        System.out.println();
        if (divisor_sum == number) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
