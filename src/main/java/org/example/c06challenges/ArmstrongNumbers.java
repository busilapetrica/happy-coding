package org.example.c06challenges;

/****************************************
 An Armstrong number is a whole number that’s equal to the sum of its digits raised to the power of
 the total number of digits.
 For example, 153 is an Armstrong number because there are three digits, and  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

 ************************************/
public class ArmstrongNumbers {

    private ArmstrongNumbers() {
    }

    public static boolean checkArmstrongNumber(int number) {
        int originalNumber = number;
        int remainder, result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += remainder * remainder * remainder;
            originalNumber /= 10;
        }
        return result == number;
    }

}
