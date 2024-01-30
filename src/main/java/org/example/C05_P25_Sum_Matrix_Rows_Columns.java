package org.example;

/*******************************************
 Write a program in C to find the sum of rows and columns of a matrix.
 Test Data :
 Input the size of the square matrix : 2
 Input elements in the first matrix :
 element - [0],[0] : 5
 element - [0],[1] : 6
 element - [1],[0] : 7
 element - [1],[1] : 8
 Expected Output :
 The First matrix is :
 The matrix is :
 5 6
 7 8
 The sum or rows and columns of the matrix is :
 5 6 11
 7 8 15

 12 14
 ********************************************/
public class C05_P25_Sum_Matrix_Rows_Columns {
    private C05_P25_Sum_Matrix_Rows_Columns () {}
    public static int[][] calculateRowsAndColumns(int[][] matrix) {
        int maxCols = 0;
        //verify maxim elements from each row and make the columns number
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxCols < matrix[i].length) {
                    maxCols = matrix[i].length;
                }
            }
        }
        //make the new array with 2 arrays and columns
        int[][] arraySum = new int[2][maxCols];
        //calculate the sum off each array
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < maxCols; j++) {
                if (j < matrix[i].length) {
                    rowSum += matrix[i][j];
                }
                arraySum[0][i] = rowSum;
            }
        }
        //calculate every column from each array
        for (int j = 0; j < maxCols; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (j < matrix[i].length) {
                    colSum += matrix[i][j];
                }
                arraySum[1][j] = colSum;
            }
        }

        return arraySum;
    }
}