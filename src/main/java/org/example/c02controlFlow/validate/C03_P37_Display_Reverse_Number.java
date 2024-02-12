package org.example.c02controlFlow.validate;

/******************************************************************************
 Write a java program to display the number in reverse: input  number : 12345
 The reverse number:  54321
 *******************************************************************************/
public class C03_P37_Display_Reverse_Number {
    private C03_P37_Display_Reverse_Number () {}

    public static String reverseNumber(int number) {
        String numberStr = Integer.toString(number);
        String result = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            result += numberStr.charAt(i);
        }
        return result;
    }
}