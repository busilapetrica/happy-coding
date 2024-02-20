package org.example.c02controlFlow.calculate;
/*****************************************************************************
 Write a program in java to display n terms of natural numbers and their Sum.
 test Data: 7
 Expect output :
 the first 7 natural number is :
 1 2 3 4 5 6 7
 the sum : 28
 *******************************************************************************/
public class SumOfNNaturalNumbers {
    private SumOfNNaturalNumbers() {}

    public static String displayNaturalNumbersAndSum(int number) {
        int sum = 0;
        String result = "";
        for(int i=1; i<=number; i++){
            sum += i;
            result += i +", ";
        }
        return (result + sum);
    }
}
