package org.example.c04matrices;

/******************************************************************************
19. Write a program in java for adding two matrices of the same size.
Test Data :
Input the size of the square matrix (less than 5): 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Input elements in the second matrix :
element - [0],[0] : 5
element - [0],[1] : 6
element - [1],[0] : 7
element - [1],[1] : 8
Expected Output :
The First matrix is :
1 2
3 4

The Second matrix is :
5 6
7 8

The Addition of two matrix is :
6 8
10 12
*******************************************************************************/

public class CalculateAdditionalOf2Matrices {
    private CalculateAdditionalOf2Matrices() {}

public static int[][] additionalOf2Matrix(int[][]... matrix) {

    int size = matrix.length;
     int countArrays = 0;
    int countElements = 0; 
   
    for (int i = 0; i < size; i++) {
        int[][] array = matrix[i];
        if (array.length > countArrays) {
            countArrays = array.length;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j].length > countElements) {
                countElements = array[j].length;
            }
        }
    }

    int[][] additionalArray = new int[countArrays][countElements];

    for (int i = 0; i < countArrays; i++) {
        for (int j = 0; j < countElements; j++) {
            additionalArray[i][j] = 0;

            for (int k = 0; k < size; k++) {
                if (i < matrix[k].length && j < matrix[k][i].length) {
                    additionalArray[i][j] += matrix[k][i][j];
                }
            }
        }
    }
    return additionalArray;
}
}
