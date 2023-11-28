package org.example;
/******************************************************************************
 Write a java program to display  a patern like diamond.
       *
      ***
     *****
    *******
     *****
      ***
       *
 ##################################################*/
public class C03_P31_Diamond_Dispay {
    public static void main(String[] args) {
        int x = 5;
        //first part
        for (int i = 1; i <= x; i++) {
            for(int j=1;j<=x-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // second part
        for(int i=x; i>=1; i--){
            for(int j=x-i; j>=1; j--){
                System.out.print(" ");
            }
            for(int j=2*i-1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
