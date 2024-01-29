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
    public static int[][] calculateRowsAndColumns(int[][] matrix) {
        int maxRows = matrix.length;
        int maxCols = 0;

        for(int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
              if(maxCols <matrix[i].length){
                  maxCols = matrix[i].length;
              }
            }
        }

        int[][] arraySum = new int[maxRows][maxCols];

        for (int i = 0; i < maxRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < maxCols; j++) {
                if (j < matrix[i].length) {
                    rowSum += matrix[i][j];
                }
                arraySum[0][i] = rowSum;
            }
        }

        for (int j = 0; j < maxCols; j++) {
            int colSum = 0;
            for (int i = 0; i < maxRows; i++) {
                if (j < matrix[i].length) {
                    colSum += matrix[i][j];
                }
                arraySum[1][j] = colSum;
            }
        }

        return arraySum;
    }
}