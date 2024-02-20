package org.example.c01operators;
/***************************************************
 Write a java program that accepts two integers from the user and calculates the product of the two integers.
 Test Data :
 Input the first integer: 25
 Input the second integer: 15
 Expected Output:
 Product of the above two integers = 375
 **************************************************/
public class ProductOf2Integers {
    private ProductOf2Integers() {}

    public static int productOf2Integers(int integer1, int integer2) {
        int result = integer1*integer2;
        return result;
    }
}
