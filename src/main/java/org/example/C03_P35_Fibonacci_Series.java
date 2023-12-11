package org.example;
/*Write a program in C to display the first n terms of the Fibonacci series.
Fibonacci series 0 1 2 3 5 8 13 .....
Test Data :
Input number of terms to display : 10
Expected Output :
Here is the Fibonacci series upto to 10 terms :
0 1 1 2 3 5 8 13 21 34
 F(n)=F(n−1)+F(n−2)*/
public class C03_P35_Fibonacci_Series {
    public static void main(String[] args){
        int previousNumber = 0;
        int lastNumber = 1;
        int count = 10;

        System.out.print(previousNumber + " " + lastNumber);

        for (int i = 3; i <= count; i++) {
            int currentFibonacciNumber = previousNumber + lastNumber;
            System.out.print(" " + currentFibonacciNumber);

            previousNumber = lastNumber;
            lastNumber = currentFibonacciNumber;
        }
    }
}
