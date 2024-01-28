package org.example;
/****************************************************
 Write a program in C to find the sum of the left diagonals of a matrix.
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
public class C05_P24_Sum_Left_Diagonal_Matrix {
        public static int sumLeftDiagonal(int[][] array) {
            int size = array.length;
            int sum = 0;

            for(int i = size - 1; i >= 0; --i) {
                if (i < array[i].length) {
                    sum += array[i][i];
                } else {
                    sum += 0;
                }
            }
            return sum;
        }
    }

