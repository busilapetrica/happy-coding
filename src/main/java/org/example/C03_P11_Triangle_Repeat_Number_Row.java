package org.example;
/******************************************************************************
 Write a program in java to make a scuch a pattern like a right angle triangle
 which will repeat a number in a row.
 1
 22
 333
 4444
 *******************************************************************************/
public class C03_P11_Triangle_Repeat_Number_Row {
    private C03_P11_Triangle_Repeat_Number_Row () {}

    public static String triangleRepeatNumber(int number) {
        String result ="";
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                result += i;
            }
            result +="\n";
        }
        return result;
    }
}
