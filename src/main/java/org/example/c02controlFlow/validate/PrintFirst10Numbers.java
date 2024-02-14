package org.example.c02controlFlow.validate;
/*****************************************************************************
 * C03_P01_Display_10_Numbers
 Write a program in java to display the first 10 numbers.
 Output:1 2 3 4 5 6 7 8 9 10
 *******************************************************************************/
public class PrintFirst10Numbers {
    private PrintFirst10Numbers() {}

    public static String loopTheNumbers(int number) {
        String result = "";
        for(int i=1; i<=10; i++){
            result += i + " ";
        }
        return result;
    }
}
