package org.example;

/**************************************
 Write a program in C to print or display the lower triangular of a given matrix.
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

 Setting zero in lower triangular matrix

 1 2 3
 0 5 6
 0 0 9
 *************************************/
public class C05_P26_Lower_Triangular_Matrix {
    public static int[][] triangularMatrix(int[][] matrix) {


        int[][] triangularArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j < i) {
                    triangularArray[i][j] = 0;
                } else {
                    triangularArray[i][j] = matrix[i][j];
                }
            }
        }

        return triangularArray;
    }
}
