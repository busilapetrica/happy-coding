package org.example;
/******************************************************************************
 30.Write a program in java to accept two matrices and check whether they are equal.
 Test Data :
 Input Rows and Columns of the 1st matrix :2 2
 Input Rows and Columns of the 2nd matrix :2 2
 Input elements in the first matrix :
 element - [0],[0] : 1
 element - [0],[1] : 2
 element - [1],[0] : 3
 element - [1],[1] : 4
 Input elements in the second matrix :
 element - [0],[0] : 1
 element - [0],[1] : 2
 element - [1],[0] : 3
 element - [1],[1] : 4
 Expected Output :
 The first matrix is :
 1 2
 3 4
 The second matrix is :
 1 2
 3 4
 The Matrices can be compared :
 Two matrices are equal.
 *******************************************************************************/
public class C05_P30_Matrix_Equals {
    private C05_P30_Matrix_Equals() {}

    public static boolean checkEgualMatrix(int[][] matrix1, int[][] matrix2){
        boolean matrixEqual = true;

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++){
                if(matrix1[i][j] != matrix2[i][j]){
                    return false;
                }
            }
        }
        return matrixEqual;
    }
}

