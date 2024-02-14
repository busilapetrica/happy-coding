package org.example.c04matrices;

/******************************************************************************
 50.Write a program in java to print a matrix in spiral form.
 Expected Output :
 The given array in matrix form is :
 1  2  3  4  5
 6  7  8  9  10
 11 12 13 14 15
 16 17 18 19 20
 The spiral form of above matrix is:
 1 2 3 4 5 10 15 20 19 18 17 16 11 6 7 8 9 14 13 12
 *******************************************************************************/
public class PrintSpiralMatrixForm {
    private PrintSpiralMatrixForm() {
    }

    public static String makeArraySpiral(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int direction = 0; // 1- left - > right,
        // 2 - up -> down,
        // 3 - right -> left
        // 4 - down - > up

        int top = 0, bottom = rows - 1, right = columns-1, left = 0;
        String result = "";

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++)
                    result += matrix[top][i] + " ";
                top++;

            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++)
                    result += matrix[i][right] + " ";
                right--;

            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result += matrix[bottom][i] + " ";
                }
                bottom--;

            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    result += matrix[i][left] + " ";
                }
                left++;
            }
            direction = (direction + 1) % 4;
        }
        return result;
    }
}