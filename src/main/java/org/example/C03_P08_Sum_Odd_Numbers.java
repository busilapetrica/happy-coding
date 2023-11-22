package org.example;

import java.util.Scanner;

/*****************************************************************************
 Write a java program to display the n terms of odd natural numbers and their sun
 Test Data
 Input number of terms : 10
 Expect output
 The odd numbers are :  1 3 5 7 9 11 13 15 17 19
 *7******************************************************************************/
public class C03_P08_Sum_Odd_Numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for (int i = 1; i <= 2 * x; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of odd numbers is: " + sum);
    }
}
