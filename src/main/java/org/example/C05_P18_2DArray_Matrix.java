package org.example;

/***************************************
 18. Write a program in java for a 2D array of size 3x3 and print the matrix.
 Test Data :
 Input elements in the matrix :
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
 ********************************************/
public class C05_P18_2DArray_Matrix {
    public static int[][] pattern2DMatrix(int[] array1, int[] array2, int[] array3) {
        int count = 0;
        if (array1.length > count) {
            count = array1.length;
        }
        if (array2.length > count) {
            count = array2.length;
        }
        if (array3.length > count) {
            count = array3.length;
        }

        int[][] resultArray = new int[3][count];

        for (int j = 0; j < count; j++) {
            if (j < array1.length) {
                resultArray[0][j] = array1[j];
            } else {
                resultArray[0][j] = 0;
            }
        }

        for (int j = 0; j < count; j++) {
            if (j < array2.length) {
                resultArray[1][j] = array2[j];
            } else {
                resultArray[1][j] = 0;
            }
        }

        for (int j = 0; j < count; j++) {
            if (j < array3.length) {
                resultArray[2][j] = array3[j];
            } else {
                resultArray[2][j] = 0;
            }
        }
        return resultArray;
    }
}