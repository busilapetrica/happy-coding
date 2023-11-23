package org.example;
/******************************************************************************
 Write a program in java to display a pattern like a right angle triangle using a asterics:
 *
 **
 ***
 ****
 *******************************************************************************/
public class C03_P09_Right_Triangle_Patern {
    public static void main(String[] args) {
        int x = 3;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
