package org.example.c04matrices.calculate;
/****************************************************
 Write a program in java to find the sum of the left diagonals of a matrix.
 Test Data :
 Input the size of the square matrix : 2
 Input elements in the first matrix :
 element - [0],[0] : 1
 element - [0],[1] : 2
 element - [1],[0] : 3
 element - [1],[1] : 4
 Expected Output :
 The matrix is :
 1 2
 3 4
 Addition of the left Diagonal elements is :5
 *******************************************************/
public class FindSumOfLeftDiagonalMatrix {
    private FindSumOfLeftDiagonalMatrix() {}

        public static int sumLeftDiagonal(int[][] matrix) {
            int size = matrix.length;
            int sum = 0;

            for(int i = size - 1; i >= 0; --i) {
                if (i < matrix[i].length) {
                    sum += matrix[i][i];
                }
            }
            return sum;
        }
    }

