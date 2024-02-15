package org.example.c02controlFlow.calculate;
/*****************************************************************************
 * C02_P20_Multiple_Numbers
 Write a java program that checks if a given non-negative number is a multiple of 3 or 7 , but not both.
 Output:
 1
 1
 0
 *******************************************************************************/
public class CheckNumberIfAreMultipleWith3And7ButNotBoth {
    private CheckNumberIfAreMultipleWith3And7ButNotBoth() {}

    static int checkNumber(int x){
        if(x%3 == 0 && x%7 == 0 ){
            return 0;
        }else{
           return 1;
        }
    }
}
