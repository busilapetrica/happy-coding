package org.example.c04matrices;

/******************************************************************************
 27 Write a program in java to print or display an upper triangular matrix.
 Test Data :
 Input the size of the square matrix : 3
 Input elements in the first matrix :
 element - [0],[0] : 1
 element - [0],[1] : 2
 element - [0],[2] : 3
 element - [1],[0] : 4
 element - [1],[1] : 5
 element - [1],[2] : 6
 element - [2],[0] : 7
 element - [2],[1] : 8
 element - [2],[2] : 9
 Expected Output :
 The matrix is :
 1 2 3
 4 5 6
 7 8 9

 Setting zero in upper triangular matrix

 1 0 0
 4 5 0
 7 8 9
 *******************************************************************************/
public class C05_P27_Upper_Triangular_Matrix {
    private C05_P27_Upper_Triangular_Matrix () {}
    public static int[][] triangular0UpRightMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] triangularMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j > i) {
                    triangularMatrix[i][j] = 0;
                } else {
                    triangularMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return triangularMatrix;
    }
}




