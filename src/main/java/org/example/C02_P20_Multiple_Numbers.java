package org.example;
/*****************************************************************************
 * C02_P20_Multiple_Numbers
 Write a java program that checks if a given non-negative number is a multiple of 3 or 7 , but not both.
 Output:
 1
 1
 0
 *******************************************************************************/
public class C02_P20_Multiple_Numbers {
    public static void main(String[] args) {
        checkNumber(3);
        checkNumber(7);
        checkNumber(21);
    }

    private static void checkNumber(int x){
        if(x%3 == 0 && x%7 == 0 ){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
