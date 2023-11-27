package org.example;
/******************************************************************************
 Write a program in java to make such a pattenn like right angle triagle with the number increasing by 1
 1
 23
 456
 78910
 *******************************************************************************/
public class C03_P12_Triagle_Incresing_Line {
    public static void main(String[] args) {
        int x = 4, count=1;
        for (int i = 1; i <= x; i++) {

            for (int j = 1; j <= i; j++,count++) {
                System.out.print(" "+count);
            }
            System.out.println();
        }
    }
}
