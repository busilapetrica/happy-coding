package org.example.c06challenges;

/****************************************
 Write a java program to convert a decimal number to hexadecimal.
 Convert Decimal to Hexadecimal:
 Input  any Decimal number: 79
 The equivalent Hexadecimal Number : 4F
 **********************************************/
public class ConvertDecimalToHexadecimal {
    private ConvertDecimalToHexadecimal() {}

    public static String convertToHexadecimal(int decimalNumber) {
        String hexadecimalDigits = "";

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            long remainder = decimalNumber % 16;
            if (remainder < 10) {
                hexadecimalDigits = (char) (remainder + '0') + hexadecimalDigits;
            } else {
                hexadecimalDigits = (char) (remainder + 'A' - 10) + hexadecimalDigits;
            }
            decimalNumber /= 16;
        }
        return hexadecimalDigits;
    }
}
