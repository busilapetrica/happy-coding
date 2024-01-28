package org.example;
/******************************************************************************
 Write a program in java to display a pattern like a right angle triangle using a asterics:
 *
 **
 ***
 ****
 *******************************************************************************/
public class C03_P09_Right_Triangle_Pattern {
    private C03_P09_Right_Triangle_Pattern () {}

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
