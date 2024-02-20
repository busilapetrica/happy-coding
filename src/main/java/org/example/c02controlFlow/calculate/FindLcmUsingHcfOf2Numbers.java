package org.example.c02controlFlow.calculate;

/******************************************************************************
 Write a java program to find the LCM of any two numbers using HCF.
 Test Data :
 Input 1st number for LCM: 15
 Input 2nd number for LCM: 20
 Expected Output :
 The LCM of 15 and 20 is : 60
 highest common factor
 Least common multiple
 *******************************************************************************/
public class FindLcmUsingHcfOf2Numbers {
    private FindLcmUsingHcfOf2Numbers() {
    }

    public static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
        int hcf = findHCF(firstNumber, secondNumber);
        return findLCM(firstNumber, secondNumber, hcf);
    }

    public static int findHCF(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static int findLCM(int firstNumber, int secondNumber, int hcf)
    {
        return (firstNumber * secondNumber) / hcf;
    }
}

