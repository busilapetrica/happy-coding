package org.example;

import java.util.Scanner;
/*
Write a C program that reads 5 numbers and counts the number of positive numbers and negative numbers.
Test Data :
Input the first number: 5
Input the second number: -4
Input the third number: 10
Input the fourth number: 15
Input the fifth number: -1
Expected Output:
Number of positive numbers: 3
Number of negative numbers: 2 */
public class C01_P27_Count_Positive_Negative_Numbers {
    public static void main(String[] args) {

        int count_positive = 0, count_negative = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter first integer x" + i + ": ");
            int x = in.nextInt();
            if (x  < 0) {
                count_negative = count_negative + 1;
            }else{
                count_positive = count_positive + 1;
            }
        }
        System.out.println("Positive numbers: " + count_positive);
        System.out.println("Negative numbers: " + count_negative);

    }
}
