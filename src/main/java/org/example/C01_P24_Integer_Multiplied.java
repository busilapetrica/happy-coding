package org.example;
import java.util.Scanner;
/*************************************************
Write a java program that reads two integers and checks whether they are multiplied or not.
Test Data :
Input the first number: 5
Input the second number: 15
Expected Output:
Multiplied! /Not multiplied!
 *************************************************/
public class C01_P24_Integer_Multiplied {
    static String checkMultipliedInt(int number1, int number2) {
        String result ="";
        if(number1 > number2)
        {
            int temp;
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if(number2 % number1 ==0) {
            result = "Multiplied!";
        }else{
            result = "Not Multiplied!";
        }
        return result;
    }
}
