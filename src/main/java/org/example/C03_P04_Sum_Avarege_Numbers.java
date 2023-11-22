package org.example;

import java.util.Scanner;

/*****************************************************************************
 Write program in java to read 10 numbers from keyboard and first their sum and average.
 Input the 10 numbers:
 Input the -1 : 2
 ..............
 Input the -10 : 55
 *******************************************************************************/
public class C03_P04_Sum_Avarege_Numbers {
    public static void main(String[] args) {
        int resultat = 0;
        double avarege;
        for(int i=1; i<=10; i++){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            resultat += x;

        }
        avarege = (double)resultat/10;
        System.out.println("Suma numerelor: " + resultat);
        System.out.println("Media numerelor: " + avarege );
    }
}
