package org.example.c06challenges;

/****************************************
 An Armstrong number is a whole number that’s equal to the sum of its digits raised to the power of
 the total number of digits.
 For example, 153 is an Armstrong number because there are three digits, and  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.

 ************************************/
public class ArmstrongNumbers {
    public static void main(String[] args) {
        int number = 153;
        boolean result = checkArmstrongNumber(number);
        System.out.println(result);
    }

    public static boolean checkArmstrongNumber(int number) {
        int lengthnumber = 0;
        boolean armstrongNumber = true;
        int sum = 0;
        while (number != 0) {
            lengthnumber++;
            number /= 10;
        }

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= lengthnumber; j++) {

            }
        }
        return true;
    }
}
