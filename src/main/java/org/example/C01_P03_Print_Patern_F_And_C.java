package org.example;

public class C01_P03_Print_Patern_F_And_C {
    /*Write a java program to print a block F using the hash (#), where the F
    has a height of six characters and width of five and four characters. And also print a very large 'C'.
    */
    public static void main(String[] args) {
        int h = 8;
        for (int i = 0; i < h; i++) {
            System.out.printf("#");
            for (int j = 0; j < h; j++) {
                if ((i == h / 2 && j <= h / 2) || i == 0) {
                    System.out.printf("#");
                } else {
                    continue;
                }
            }
            System.out.printf("\n");
        }

        System.out.printf("\n \n ");
        for (int i = 0; i < h; i++) {
            System.out.printf("#");
            for (int j = 0; j < (h - 1); j++) {
                if (i == 0 || i == h - 1) {
                    System.out.printf("#");
                } else {
                    continue;
                }
            }
            System.out.printf("\n");
        }
    }
}