package org.example;
/******************************************************************************
 C02_P5_Integer_Divided
 write a program thet check of a positive number integer is divided by either 3 or 7, or bouth.
 If the integer is a mutiple of 3, then program will return true.
 similary, if the integer is a multiple of 7, then olso the program will return true .
 If the integer is not multiple of 3 and 7, then the program will return false
 Expect output:
 1
 1
 1
 0
 *******************************************************************************/
public class C02_P5_Integer_Divided {
    public static void main(String[] args) {

        checkNumber(3);
        checkNumber(14);
        checkNumber(12);
        checkNumber(37);
    }

    public static void checkNumber(int x){

        if(x%3 == 0 || x%7 == 0 ){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
