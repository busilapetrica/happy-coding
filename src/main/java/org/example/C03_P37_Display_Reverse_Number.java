package org.example;

/******************************************************************************
 Write a java program to display the number in reverse: input  number : 12345
 The reverse number:  54321
 *******************************************************************************/
public class C03_P37_Display_Reverse_Number{
    public static void main (String[]args){
        int number = 12345;
        String numberStr = Integer.toString(number);

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            System.out.print(numberStr.charAt(i));
        }
    }
}