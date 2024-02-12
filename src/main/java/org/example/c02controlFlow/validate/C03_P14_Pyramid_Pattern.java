package org.example.c02controlFlow.validate;
/******************************************************************************
 Write a program in java to make such a patern with as a piramide with an asteriks.
    *
   * *
  * * *
 * * * *
 *******************************************************************************/
public class C03_P14_Pyramid_Pattern {
    private C03_P14_Pyramid_Pattern () {}

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
