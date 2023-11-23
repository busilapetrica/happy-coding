package org.example;
/******************************************************************************
 Write a program in java to display a pattern like a right angle triangle with a number
 1
 12
 123
 1234
 *******************************************************************************/
public class C03_P010_Right_Number_Triangle_Patern {
    public static void main(String[] args) {
        int x = 4;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
