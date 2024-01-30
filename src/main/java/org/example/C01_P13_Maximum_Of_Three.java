package org.example;
/*******************************************************
 Write a java program that accepts three integers and finds the maximum of three.
Test Data :
Input the first integer: 25
Input the second integer: 35
Input the third integer: 15
Expected Output:
Maximum value of three integers: 35
*****************************************************/
public class C01_P13_Maximum_Of_Three {
    private C01_P13_Maximum_Of_Three () {}

    public static int findMaximOf3Integers(int first_int, int second_int, int third_int) {
        if (first_int > second_int && first_int > third_int) {
            return first_int;
        } else if (second_int > first_int && second_int > third_int) {
            return second_int;
        } else {
            return third_int;
        }
    }
}
