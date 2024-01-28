package org.example;
/****************************************************
Write a C program that reads 5 numbers and sums all odd values between them.
Test Data :
Input the first number: 11
Input the second number: 17
Input the third number: 13
Input the fourth number: 12
Input the fifth number: 5
Expected Output:
Sum of all odd values: 46
 *****************************************************/
public class C01_P22_Sum_Of_5_odd_numbers {
    private C01_P22_Sum_Of_5_odd_numbers () {}

    static int calculateSumOddNumbers(int[] inputs) {
        int result=0;

        for (int i = 0; i <= inputs.length - 1; i++){
            if(inputs[i] % 2==1){
             result += inputs[i];
         }
    }
        return result;
    }
}
