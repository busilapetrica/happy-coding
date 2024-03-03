package org.example.c06challenges;

/**********************************
 Write a program in java to convert a decimal number to a binary number using the function.
 Function : convert decimal to binary :
 Input any decimal number : 65
 The Binary value is : 1000001
 */
public class ConvertDecimalToBinary {
    private ConvertDecimalToBinary() {}

    public static long convertNumberToBinary(int number) {
        long binaryNumber = 0;
        long position = 1;
        while (number != 0) {
            binaryNumber += (number % 2) * position;
            position *= 10;
            number = number / 2;
        }
        return binaryNumber;
    }
}
