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
    private C03_P33_Display_Pascals_Triangle () {}

    public static String pascalsTriangle(int rows) {
        String result = "";
        int count = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                result += " ";
            }

            int currentNumber = count;
            while (currentNumber != 0) {
                result += currentNumber % 10 + "  ";
                currentNumber /= 10;
            }

            count *= 11;
            result += "\n";
        }
        return result;
    }
}




