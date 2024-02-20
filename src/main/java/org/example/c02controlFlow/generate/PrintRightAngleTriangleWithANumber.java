package org.example.c02controlFlow.generate;
/******************************************************************************
 Write a program in java to display a pattern like a right angle triangle with a number
 1
 12
 123
 1234
 *******************************************************************************/
public class PrintRightAngleTriangleWithANumber {
    private PrintRightAngleTriangleWithANumber() {}

    public static String patternTriangleNumbers(int number) {
        String result = "";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                result += j;
            }
            result +="\n";
        }
        return result;
    }
}
