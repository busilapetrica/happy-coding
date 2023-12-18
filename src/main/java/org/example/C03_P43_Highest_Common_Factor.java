package org.example;
/******************************************************************************
 Write a java program to find the HCF (Highest Common Factor) of two numbers.
 Test Data :
 Input 1st number for HCF: 24
 Input 2nd number for HCF: 28
 Expected Output :
 HCF of 24 and 28 is : 4
 *******************************************************************************/
public class C03_P43_Highest_Common_Factor{
    public static void main (String[]args){
        int firstNumber = 24;
        int secondNumber = 28;
        // Algoritmul Euclid
        //The algorithm consists of a series of successive divisions until a remainder equal to zero is obtained.
        System.out.print("The Highest Common Factor of " + firstNumber + " and " + secondNumber + " is : ");
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }

        System.out.print(firstNumber);
    }
}