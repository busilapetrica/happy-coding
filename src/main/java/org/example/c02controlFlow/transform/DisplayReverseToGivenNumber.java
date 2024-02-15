package org.example.c02controlFlow.transform;

/******************************************************************************
 Write a java program to display the number in reverse: input  number : 12345
 The reverse number:  54321
 *******************************************************************************/
public class DisplayReverseToGivenNumber {
    private DisplayReverseToGivenNumber() {}

    public static String reverseNumber(int number) {
        String numberStr = Integer.toString(number);
        String result = "";
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            result += numberStr.charAt(i);
        }
        return result;
    }
}