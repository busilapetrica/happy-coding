package org.example;
/******************************************************************************
 * C03_P13_Consecutive_Piramid_Number
 Write a program in java to make such a patern with numbers increasing my 1.
    1
   2 3
  4 5 6
 7 8 9 10
 *******************************************************************************/
public class C03_P13_Consecutive_Piramid_Number {
        public static void main(String[] args) {
            int x = 4, count=1;
            for (int i = 1; i <= x; i++) {
                for(int j=1;j<=x-i; j++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++,count++) {
                    System.out.print(" "+count);
                }
                System.out.println();
            }
        }
    }
