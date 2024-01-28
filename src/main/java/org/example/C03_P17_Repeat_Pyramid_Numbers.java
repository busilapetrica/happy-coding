package org.example;
/******************************************************************************
 Write a java program to make such a pattern like pyramid number which will repeat
 the number in the same row.
 *******************************************************************************/
public class C03_P17_Repeat_Pyramid_Numbers {
    private C03_P17_Repeat_Pyramid_Numbers () {}

    public static String pyramidNumbers(int rows) {
        int count = 1;
        String result ="";
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                result += " ";
            }

            for (int k = 0; k <= i; k++) {
                result += " " + count;
            }
            count++;
            result +="\n";
        }
        return result;
    }
}
