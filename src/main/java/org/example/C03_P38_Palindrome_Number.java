package org.example;

/******************************************************************************
 Write a java program to check whether a number is a palindrome or not.
 number = 121
 Expect output:  121 is a palindrome number
 *******************************************************************************/
public class C03_P38_Palindrome_Number {
    public static void main (String[]args){
        int number = 121;
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        if (originalNumber == reversedNumber){
            System.out.print ("The number  " + originalNumber + " is palindrome");
        }else{
            System.out.print ("The number " + originalNumber + " is not a palindrome");
        }
    }
}