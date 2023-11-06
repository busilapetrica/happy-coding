package org.example;

import java.util.Scanner;

public class C01_P10_Product_2_Integer {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first integer : ");
        int x = in.nextInt();
        System.out.println("enter second integer : ");
        int y = in.nextInt();
        int result = x*y;
        System.out.println("Total = " + result);
    }
}
