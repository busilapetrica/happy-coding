package org.example;
/*********************************************
Write a program in java to print Floyd's Triangle.
1
01
101
0101
10101
 *********************************************/
public class PrintFloydsTriangle {
    private PrintFloydsTriangle() {}

    public static String getFloydTriangle(int height) {
        StringBuilder result = new StringBuilder();
        int count;

        for (int i = 0; i < height; i++) {
            count = (i + 1) % 2; // Start with 1 or 0 depending on the row index

            for (int j = 0; j <= i; j++) {
                result.append(count);
                count = 1 - count; // Toggle between 1 and 0
            }

            if (i < height - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
