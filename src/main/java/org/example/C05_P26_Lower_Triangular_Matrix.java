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
    public static int[][] triangularMatrix(int[][] array) {
        int sizeArray = array.length;
        int countRows = 0;

        for (int i = 0; i < sizeArray; i++) {
            if (countRows < array[i].length) {
                countRows = array[i].length;
            }
        }

        int[][] triangularArray = new int[sizeArray][countRows];

        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < countRows; j++) {
                if (j < i) {
                    triangularArray[i][j] = 0;
                } else {
                    triangularArray[i][j] = array[i][j];
                }
            }
        }

        return triangularArray;
    }
}
