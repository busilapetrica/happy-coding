package org.example.c05recursion;
/*************************************************
 Write a program in java to print the Fibonacci Series using recursion. >
 Test Data :
 Input number of terms for the Series (< 20) : 10
 Expected Output:

 Input number of terms for the Series (< 20) : 10
 The Series are :
 1  1  2  3  5  8  13  21  34  55

 F(n)=F(n−1)+F(n−2)
 **************************************************/
public class PrintNNumbersFibonacciSeriesUsingRecursion {
    private PrintNNumbersFibonacciSeriesUsingRecursion() {
    }
    public static String fibonacciStringConstruct(int fibNumberLength) {
        String result = "";

        for (int i = 1; i <= fibNumberLength; i++) {
            result += fibonacciSeries(i) + " ";
        }
        return result;
    }

    public static int fibonacciSeries(int count) {
        if (count == 1 || count == 2) {
            return 1;
        }
        return fibonacciSeries(count - 1) + fibonacciSeries(count - 2);
    }
}