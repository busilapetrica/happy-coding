package org.example.c05recursion;
/********************************************
 Write a program in java to find the Factorial of a number using recursion. >
 Test Data :
 Input a number : 5
 Expected Output:
 The Factorial of 5 is : 120
 *******************************************/
public class FindFactorialNumber {
    private FindFactorialNumber() {
    }
    public static int findFactorial(int number) {
            if(number==1)
                return 1;
            else
                return(number*findFactorial(number-1));
    }
}
