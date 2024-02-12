package org.example.c02controlFlow.validate;
/******************************************************************************
 * C03_P13_Consecutive_Pyramid_Number
 Write a program in java to make such a pattern with numbers increasing my 1.
 1
 2 3
 4 5 6
 7 8 9 10
 *******************************************************************************/
public class C03_P13_Consecutive_Pyramid_Number {
    private C03_P13_Consecutive_Pyramid_Number () {}

    public static String consecutivePyramid(int rows) {
        int count = 1;
        String result ="";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                result +=" ";
            }
            for (int j = 1; j <= i; j++, count++) {
                result += count;
                if(j<i){
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}
