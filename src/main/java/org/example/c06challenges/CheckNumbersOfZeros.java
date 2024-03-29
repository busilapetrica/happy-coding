package org.example.c06challenges;

/******************************************************************************
 Write a program in java to accept a matrix and determine whether it is a sparse matrix.
 Test Data :
 Input the number of rows of the matrix : 2
 Input the number of columns of the matrix : 2
 Input elements in the first matrix :
 element - [0],[0] : 0
 element - [0],[1] : 0
 element - [1],[0] : 1
 element - [1],[1] : 0
 Expected Output :
 The given matrix is sparse matrix.
 There are 3 number of zeros in the matrix
 *******************************************************************************/
public class CheckNumbersOfZeros {
    private CheckNumbersOfZeros() {
    }

    public static boolean checkNumbersOfZeros(int[][] matrix) {
        int countRows = matrix.length;
        int countColumns = matrix[0].length;
        boolean sparseMatrix = true;
        int count = 0;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    count++;
                }
            }
        }

        if (count >= countRows * countColumns / 2) {
            sparseMatrix = false;
        }

        return sparseMatrix;
    }
}
