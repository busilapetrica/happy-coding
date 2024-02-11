package org.example.c02controlFlow.calculate;
/*****************************************************************************
 Write a program in java to compute the sum of the first 10 natural numbers.
 the first 10 natural numbers :1 2 3 4 5 6 7 8 9 10
 sum = 55
 *******************************************************************************/
public class SumOfNaturalNumbers {
    private SumOfNaturalNumbers() {}

    public static int sumNaturalNumbers(int number) {
        int result = 0;
        for(int i=1; i<=number; i++){
            result += i;
        }
        return result;
    }
}
