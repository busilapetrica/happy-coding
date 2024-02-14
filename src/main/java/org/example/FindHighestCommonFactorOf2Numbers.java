package org.example;

/******************************************************************************
 Write a java program to find the HCF (Highest Common Factor) of two numbers.
 Test Data :
 Input 1st number for HCF: 24
 Input 2nd number for HCF: 28
 Expected Output :
 HCF of 24 and 28 is : 4
 *******************************************************************************/
public class FindHighestCommonFactorOf2Numbers {
    private FindHighestCommonFactorOf2Numbers() {}

    public static int findHighestCommonFactor(int firstNumber, int secondNumber) {
        // Algorithm Euclid
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}