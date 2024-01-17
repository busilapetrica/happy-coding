package org.example;
/************************************************************
 * Write a program in java to separate odd and even integers into separate arrays.
  Test Data :
  Input the number of elements to be stored in the array :5
  Input 5 elements in the array :
  element - 0 : 25
  element - 1 : 47
  element - 2 : 42
  element - 3 : 56
  element - 4 : 32
  Expected Output :
  The Even elements are :
  42 56 32
  The Odd elements are :
  25 47
 **********************************************************************/
public class C05_P10_Odd_And_Even_Numbers {
    public static int[][] separateOddAndEvenNumbers(int[] array) {
        int countEven = 0;
        int countOdd = 0;

        // Count even and odd numbers from array
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        int[] evenNumberArray = new int[countEven];
        int[] oddNumberArray = new int[countOdd];

        countEven = 0;
        countOdd = 0;

        // Fill even and odd arrays
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNumberArray[countEven++] = array[i];
            } else {
                oddNumberArray[countOdd++] = array[i];
            }
        }
        return new int[][] { evenNumberArray, oddNumberArray };
    }
}
