package org.example;

/*********************************************************
 *  23. Write a program in java to find the sum of the right diagonals of a matrix.
 *  Test Data : Input the size of the square matrix : 2
 *  Input elements in the first matrix :
 *  element - [0],[0] : 1
 *  element - [0],[1] : 2
 *  element - [1],[0] : 3
 *  element - [1],[1] : 4
 *  Expected Output : The matrix is : 1 2 3 4
 *  Addition of the right Diagonal elements is :5
 *  Elements in array are:
 *  *********************************************************/
public class C05_P23_Sum_Diagonal_Matrix {
    private C05_P23_Sum_Diagonal_Matrix () {}

    public static int diagonalMatrixSum(int[][] array) {
        int size = array.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (i < array[i].length) {
                sum += array[i][i];
            }else{
                sum +=0;
            }
        }
        return sum;
    }
}

