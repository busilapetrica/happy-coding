package org.example.c02controlFlow.generate;
/******************************************************************************
 Write a program in java to make such a pattern with as a pyramid with an asterisks.
    *
   * *
  * * *
 * * * *
 *******************************************************************************/
public class PyramidPatternWithAsterisks {
    private PyramidPatternWithAsterisks() {}

    public static String pyramidPattern(int rows) {
        int count = 1;
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                result += " ";
            }
            for (int j = 1; j <= i; j++, count++) {
                result += "*";
                if (j < i) {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}
