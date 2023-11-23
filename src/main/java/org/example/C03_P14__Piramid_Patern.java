package org.example;
/******************************************************************************
 Write a program in java to make such a patern with as a piramide with an asteriks.
 *
 * *
 * * *
 * * * *
 *******************************************************************************/
public class C03_P14__Piramid_Patern {
    public static void main(String[] args) {
        int x = 4;
        int count = 1;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++, count++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
