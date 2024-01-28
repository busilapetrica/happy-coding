package org.example;
/************************************************
Write a java program that accepts two integers from the user and calculates the sum of the two integers.
Test Data :
Input the first integer: 25
Input the second integer: 38
Expected Output:
Sum of the above two integers = 63
 *****************************************/
public class C01_P09_Sum_2_Integers {
    private C01_P09_Sum_2_Integers () {}

    static int sumOf2Integers(int integer1, int integer2) {
        int result = integer1+integer2;
        return result;
    }
}
