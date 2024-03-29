package org.example.c04matrices.calculate;

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
public class Print2DMatrix {
    private Print2DMatrix() {}

public static int[][] pattern2DMatrix(int[]... matrix) {
        //count maximum length of matrix
    int count = 0;
    for (int i = 0; i < matrix.length; i++) {
    int[] rows = matrix[i];
        if (rows.length > count) {
            count = rows.length;
        }
    }
    //create a 2D matrix
    int[][] resultMatrix = new int[matrix.length][count];
    //add elements to new matrix
    // if the length of one array is to small  add "0"
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < count; j++) {
            if (j < matrix[i].length) {
                resultMatrix[i][j] = matrix[i][j];
            } else {
                resultMatrix[i][j] = 0;
            }
        }
    }
    return resultMatrix;
}
}
