package org.example.c02controlFlow.calculate;

/***********************************
 Write a java program to determine whether a given number is prime or not.
 Test Data :
 Input a number: 13
 Expected Output :
 13 is a prime number.
 ********************************/
public class CheckNumberIfIsPrimeOrNot {
    private CheckNumberIfIsPrimeOrNot() {}

    public static boolean findPrimeNumber(int number) {
        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }
}
