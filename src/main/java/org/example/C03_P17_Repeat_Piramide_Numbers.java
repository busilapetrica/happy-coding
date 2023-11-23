package org.example;
/******************************************************************************
 Write a java program to make such a pattern like pyramide number wich will repeat the number in the same row.
 *******************************************************************************/
public class C03_P17_Repeat_Piramide_Numbers {
    public static void main(String[] args) {
        int x = 9;
        int count = 1;
        for (int i = 0; i < x; i++) { // rânduri

            for (int j = i; j < x; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(" " + count);
            }
            count++;
            System.out.println();
        }
    }
}
