package org.example.c02controlFlow.generate;
/******************************************************************************
 Write a program in java to display a pattern like a right angle triangle using a asterics:
 *
 **
 ***
 ****
 *******************************************************************************/
public class PrintRightTrianglePatternWithAsterisks {
    private PrintRightTrianglePatternWithAsterisks() {}

    public static String trianglePattern(int number) {
        String result = "";
        for (int i = 0; i <= number -1; i++) {
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result +="\n";
        }
        return result;
    }
}
