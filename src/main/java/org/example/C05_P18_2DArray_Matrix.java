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
    public static String patern2DMatrix(int[] array1, int[] array2, int[] array3) {
        String result = "";

        for (int i = 0; i < array1.length; i++) {
            result += array1[i] + " ";
        }
        result += "\n";

        for (int i = 0; i < array2.length; i++) {
            result += array2[i] + " ";
        }
        result += "\n";

        for (int i = 0; i < array3.length; i++) {
            result += array3[i] + " ";
        }

        return result;
    }
}