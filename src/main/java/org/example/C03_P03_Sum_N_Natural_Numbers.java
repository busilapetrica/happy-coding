package org.example;
/*****************************************************************************
 Write a program in java to display n terms of natural numbers and their Sum.
 test Data: 7
 Expect output :
 the first 7 natural number is :
 1 2 3 4 5 6 7
 the sum : 28
 *******************************************************************************/
public class C03_P03_Sum_N_Natural_Numbers {
    public static void main(String[] args) {
        int num = 7 , result = 0;
        for(int i=1; i<=num; i++){
            result += i;
        }
        System.out.println(result);
    }
}
