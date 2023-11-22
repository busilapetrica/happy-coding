package org.example;

import java.util.Scanner;

/*****************************************************************************
 Write a program in java to display the multiplier table vertically from 1 to n.
 input 8
 Export
 1X1=1, 1X2=2, 1X3=3, 1X4=4, 1X5=5, 1X6=6, 1X7=7, 1X8=8,
 ..........
 8X1=8, 8X2=16, 8X3=24, 8X4=32, 8X5=40, 8X6=48, 8X7=56, 8X8=64
 *******************************************************************************/
public class C03_P07_Table_Given_Integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                System.out.print(i + "X" + j +"=" + i*j + ", ");
            }
            System.out.println("\n");
        }
    }
}
