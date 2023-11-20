package org.example;

import java.util.Scanner;

public class C01_P24_Integer_Multiplied {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter fist number:");
        int x = in.nextInt();
        System.out.println("Enter second number:");
        int y = in.nextInt();

            if(x>y){
                x = x ^ y ^ (y = x);
            }

        if(y%x==0) {
            System.out.println("Multiplaied!");
        }else{
            System.out.println("Not Multiplaied!");
        }
    }

}
