package org.example;

import java.util.Scanner;

/*
Write a C program to check whether a given number is a 'Perfect' number or not.
Test Data :
Input the number : 56
Expected Output :
The positive divisor : 1 2 4 7 8 14 28
The sum of the divisor is : 64
So, the number is not perfect.
 */
public class C03_P27_Perfect_Number {

    public static void main(String[] args){
        int divisor_sum=0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for(int i=1; i<x; i++){
            if(x % i == 0){
                System.out.print( i + " ");
                divisor_sum+=i;
            }
        }
        System.out.println();
        if(divisor_sum == x){
            System.out.println("Th number is perfect");
            System.out.println("Sum of divisors" + divisor_sum);
        }else{
            System.out.println("Th number is not perfect");
            System.out.println("Sum of divisors: " + divisor_sum);
        }
    }
}
