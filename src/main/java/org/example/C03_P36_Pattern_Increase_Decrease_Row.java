package org.example;
/******************************************************************************
 Write a java program to display a such a pattern for n rows using a number that starts with 1 and each
 row will have a 1 as the first and last number.
   1
  121
 12321
 *******************************************************************************/
public class C03_P36_Pattern_Increase_Decrease_Row {
    public static String patternIncreaseAndDecreaseNumbers(int rows) {
        String result = "";
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                result += " ";
            }
            for (int k = 1; k <= i; k++) {
                result += k;
            }
            for (int l = i - 1; l >= 1; l--) {
                result += l;
            }
            result += "\n";
        }
        return result;
    }
}