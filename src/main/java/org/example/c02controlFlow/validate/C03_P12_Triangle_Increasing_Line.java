package org.example.c02controlFlow.validate;
/******************************************************************************
 Write a program in java to make such a patten like right angle triangle with the number increasing by 1
 1
 23
 456
 78910
 *******************************************************************************/
public class C03_P12_Triangle_Increasing_Line {
    private C03_P12_Triangle_Increasing_Line () {}

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
