package org.example.c01operators;
/************************************************
Write a java program that accepts two integers from the user and calculates the sum of the two integers.
Test Data :
Input the first integer: 25
Input the second integer: 38
Expected Output:
Sum of the above two integers = 63
 *****************************************/
public class SumOf2Integers {
    private SumOf2Integers() {}

    public static int sumOf2Integers(int integer1, int integer2) {
        int result = integer1+integer2;
        return result;
    }
}
