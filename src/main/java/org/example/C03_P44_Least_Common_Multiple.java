package org.example;

/******************************************************************************
 Write a java program to find the LCM of any two numbers using HCF.
 Test Data :
 Input 1st number for LCM: 15
 Input 2nd number for LCM: 20
 Expected Output :
 The LCM of 15 and 20 is : 60
 highest common factor
 least common multiple
 *******************************************************************************/
public class C03_P44_Least_Common_Multiple {
    public static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
        int hcf = findHCF(firstNumber, secondNumber);
        int lcm = findLCM(firstNumber, secondNumber, hcf);

        return lcm;
    }

    public static int findHCF(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }

    public static int findLCM(int firstNumber, int secondNumber, int hcf) {
        return (firstNumber * secondNumber) / hcf;
    }
}

