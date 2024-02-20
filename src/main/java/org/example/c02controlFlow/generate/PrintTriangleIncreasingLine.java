package org.example.c02controlFlow.generate;
/******************************************************************************
 Write a program in java to make such a patten like right angle triangle with the number increasing by 1
 1
 23
 456
 78910
 *******************************************************************************/
public class PrintTriangleIncreasingLine {
    private PrintTriangleIncreasingLine() {}

    public static String patternTriangle(int rows) {
        int count = 1;
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++, count++) {
                result += count;
            }
            result += "\n";
        }
        return result;
    }
}
