package org.example;
/*
Write a java program to display Pascal's triangle.
 Test Data :
Input number of rows: 5
Expected Output :
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1
 */
public class C03_P33_Display_Pascals_Triangle {
    public static void main(String[] args) {
        int rows = 5;
        int count = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            int currentNumber = count;
            while (currentNumber != 0) {
                System.out.print(currentNumber % 10 + "   ");
                currentNumber /= 10;
            }

            count *= 11;
            System.out.println();
        }
    }
}




