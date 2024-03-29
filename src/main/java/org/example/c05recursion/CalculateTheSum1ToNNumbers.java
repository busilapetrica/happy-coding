package org.example.c05recursion;

/*****************************************
 Write a program in java to calculate the sum of numbers from 1 to n using recursion.
 Test Data :
 Input the last number of the range starting from 1 : 5
 Expected Output:
 The sum of numbers from 1 to 5 :
 15
 *****************************************/
public class CalculateTheSum1ToNNumbers {
    private CalculateTheSum1ToNNumbers() {
    }

    public static int sumOfRange(int number) {
        int result;
        if (number == 1) {
            return 1;
        } else {
            result = number + sumOfRange(number - 1);
        }
        return result;
    }
}
