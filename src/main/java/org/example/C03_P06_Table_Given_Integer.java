package org.example;

import java.util.Scanner;

/*****************************************************************************
 Write program in java to to display multiplication table for a given integer..
 EX: Input the number : 15
 Output : 15X1=15
 *******************************************************************************/
public class C03_P06_Table_Given_Integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(x + "X" + i +"=" + i*x);
        }
    }
}
