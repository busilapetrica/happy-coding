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
    public static void main(String[] args) {
        int x = 4;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
