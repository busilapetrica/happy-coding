package org.example;
/******************************************************************************
 Write a program in java to display the sum of n terms of even natural numbers.
 Test data:
 5
 Even numbers are :  2 4 6 8 10
 The sum : 30
 *******************************************************************************/
public class C03_P16_Sum_Even_Numbers {
    public static void main(String[] args) {
        int x = 5;
        int result = 0;
        for (int i = 0; i <= x*2; i+=2) {
            result += i;
        }
        System.out.println(result);
    }
}
