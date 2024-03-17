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
        int tempNumber = number;
        int remainder;
        int result = 0;
        int lengthNumber = 0;

        while (tempNumber > 0) {
            tempNumber /= 10;
            lengthNumber++;
        }

        if(number == 0){
           return result != number;
        }

        if(lengthNumber == 1){
            result = number;
        }else {

            while (originalNumber != 0) {
                remainder = originalNumber % 10;

                int tempResult = 1;
                for (int i = 0; i < lengthNumber; i++) {
                    tempResult *= remainder;
                }
                result += tempResult;

                originalNumber /= 10;

            }
        }
        return result == number;
    }
}
