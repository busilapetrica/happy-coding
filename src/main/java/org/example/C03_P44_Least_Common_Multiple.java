package org.example;
/******************************************************************************
 Write a java program to find the LCM of any two numbers using HCF.
 Test Data :
 Input 1st number for LCM: 15
 Input 2nd number for LCM: 20
 Expected Output :
 The LCM of 15 and 20 is : 60
 *******************************************************************************/
public class C03_P44_Least_Common_Multiple{
    public static void main(String[] args) {
        int firstNumber = 15;
        int secondNumber = 20;

        int hcf = findHCF(firstNumber, secondNumber);
        int lcm = findLCM(firstNumber, secondNumber, hcf);

        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is : " + lcm);
    }

    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }
}

