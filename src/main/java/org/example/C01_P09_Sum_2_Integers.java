package org.example;

import java.util.Scanner;
/*Write a C program that accepts two integers from the user and calculates the sum of the two integers.
Test Data :
Input the first integer: 25
Input the second integer: 38
Expected Output:
Sum of the above two integers = 63*/
public class C01_P09_Sum_2_Integers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first integer : ");
        int x = in.nextInt();
        System.out.println("enter second integer : ");
        int y = in.nextInt();
        int result = x+y;
        System.out.println("Total = " + result);
    }
}
