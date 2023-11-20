package org.example;

import java.util.Scanner;

/*
Write a C program that reads 5 numbers and sums all odd values between them.
Test Data :
Input the first number: 11
Input the second number: 17
Input the third number: 13
Input the fourth number: 12
Input the fifth number: 5
Expected Output:
Sum of all odd values: 46 */
public class C01_P22_Sum_Of_5_odd_numbers {
    public static void main(String[] args) {
        int result=0;
        Scanner in = new Scanner(System.in);
            for (int i = 1; i <= 5; i++){
             System.out.println("enter first integer x" + i + ": ");
             int x = in.nextInt();
                if(x % 2==1){
                 result = result + x;
             }
        }
            System.out.println(result);
    }
}
