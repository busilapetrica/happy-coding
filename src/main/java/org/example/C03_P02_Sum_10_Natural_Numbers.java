package org.example;
/*****************************************************************************
 Write a program in java to compute the sum of the first 10 natural numbers.
 the first 10 natural numbers :1 2 3 4 5 6 7 8 9 10
 sum = 55
 *******************************************************************************/
public class C03_P02_Sum_10_Natural_Numbers {
    public static void main(String[] args) {
        int resultat = 0;
        for(int i=1; i<=10; i++){
            resultat += i;
        }
        System.out.println(resultat);
    }
}
