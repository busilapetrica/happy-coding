package org.example;
/*************************************************
 Write a program in java to display the first n terms of the Fibonacci series.
 Fibonacci series 0 1 2 3 5 8 13 .....
 Test Data :
 Input number of terms to display : 10
 Expected Output :
 Here is the Fibonacci series upto to 10 terms :
 0 1 1 2 3 5 8 13 21 34
 F(n)=F(n−1)+F(n−2)
 **************************************************/
public class C03_P35_Fibonacci_Series {
    private C03_P35_Fibonacci_Series () {}

    public static String fibonacciNumbers(int countFibonacciNumbers) {
        int previousNumber = 0;
        int lastNumber = 1;
        String result = "";

        result += previousNumber + " " + lastNumber;

        for (int i = 3; i <= countFibonacciNumbers; i++) {
            int currentFibonacciNumber = previousNumber + lastNumber;
            result += " " + currentFibonacciNumber;

            previousNumber = lastNumber;
            lastNumber = currentFibonacciNumber;
        }
        return result;
    }
}
