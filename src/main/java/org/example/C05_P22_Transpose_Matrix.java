package org.example;
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
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {4, 5, 6}};

        int[][] result = transposeMatrix(array);

        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
     }
   
    public static int[][] transposeMatrix(int[][] array) {
    int rows = array.length;
    int cols = 0;

    for (int i = 0; i < rows; i++) {
        if (array[i].length > cols) {
            cols = array[i].length;
        }
    }

    int[][] transposeMatrix = new int[cols][rows];
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < array[i].length; j++) {
            transposeMatrix[j][i] = array[i][j];
        }
    }
    return transposeMatrix;
 }
}
