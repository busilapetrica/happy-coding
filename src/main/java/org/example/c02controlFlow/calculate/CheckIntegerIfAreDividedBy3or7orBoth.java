package org.example.c02controlFlow.calculate;
/******************************************************************************
 write a program the check of a positive number integer is divided by either 3 or 7, or both.
 If the integer is a multiple of 3, then program will return true.
 similar, if the integer is a multiple of 7, then also the program will return true .
 If the integer is not multiple of 3 and 7, then the program will return false
 Expect output:
 1
 1
 1
 0
 *******************************************************************************/
public class CheckIntegerIfAreDividedBy3or7orBoth {
    private CheckIntegerIfAreDividedBy3or7orBoth() {}

    public static int checkNumber(int x){
        if(x%3 == 0 || x%7 == 0 ){
            return 1;
        }else{
            return 0;
        }
    }
}
