package org.example.c04matrices;
/**********************************************************************
Write a program in java to find the transpose of a given matrix.
Test Data :
Input the rows and columns of the matrix : 2 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The matrix is :
1 2
3 4
 
The transpose of a matrix is :
1 3
2 4
***********************************************************/
public class C05_P22_Transpose_Matrix {
    private C05_P22_Transpose_Matrix () {}

    public static int[][] transposeMatrix(int[][] matrix) {
    int rows = matrix.length;
    int cols = 0;

    for (int i = 0; i < rows; i++) {
        if (matrix[i].length > cols) {
            cols = matrix[i].length;
        }
    }

    int[][] transposeMatrix = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            transposeMatrix[j][i] = matrix[i][j];
        }
    }
    return transposeMatrix;
 }
}
