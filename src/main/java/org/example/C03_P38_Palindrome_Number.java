package org.example;

/******************************************************************************
 Write a java program to check whether a number is a palindrome or not.
 number = 121
 Expect output:  121 is a palindrome number
 *******************************************************************************/
public class C03_P38_Palindrome_Number {
    public static void main (String[]args){

        //input
        int number = 121;

        //logica(algoritmica)
        String message = isPalindrome(number);
        //output
        System.out.print(message);
    }

    public static String isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        String message;
        if (originalNumber == reversedNumber){
            message = "The number " + originalNumber + " is palindrome";
        }else{
            message = "The number " + originalNumber + " is not a palindrome";
        }
        return message;
    }
}