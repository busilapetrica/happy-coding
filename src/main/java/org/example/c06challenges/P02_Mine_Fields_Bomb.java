package org.example.c06challenges;
/***********************************************************************
 A field of N x M squares is represented by N lines of exactly M characters each.
 o) The character '*' represents a mine.
 o) The character '.' represents no-mine.
 Example input (a 3 x 4 mine-field of 12 squares, 2 of which are mines)
 3 4
 *...
 ..*.
 ....
 Your task is to write a program to accept this input and produce as output a hint-field of identical
 dimensions where each square is a * for a mine or the number of adjacent mine-squares if the square
 does not contain a mine.
 Example output (for the above input)
 *211
 12*1
 0111
 *******************************************************************************/
public class P02_Mine_Fields_Bomb {
    public P02_Mine_Fields_Bomb() {
    }
    public static String[][] mineField(String[][] matrix, int[][] minePositions) {

            int matrixRowsCount = matrix.length;
            int matrixColumnsCount = matrix[0].length;

            for (int i = 0; i < matrixRowsCount; i++) {
                for (int j = 0; j < matrixColumnsCount; j++) {
                    matrix[i][j] = ".";
                }
            }

            // we add the mines in matrix
            for (int i=0; i< minePositions.length; i++ ) {
                int row = minePositions[i][0];
                int col = minePositions[i][1];
                if(matrixRowsCount > row && matrixColumnsCount > col){
                    matrix[row][col] = "*";
                }
            }

            for (int i = 0; i < matrixRowsCount; i++) {
                for (int j = 0; j < matrixColumnsCount; j++) {
                    if (matrix[i][j] != "*") {
                        int count = 0;

                        //we make a loop for neighbor fields
                        for(int k = -1; k <=1; k++){
                            for(int l =-1; l<=1 ; l++ ){
                                int rows = i+k;
                                int columns = j +l;

                                //we added a condition to be in square if the field is at beginning or the end
                                if((rows >= 0 && rows < matrixRowsCount) &&
                                        (columns >=0 && columns < matrixColumnsCount) &&
                                        (matrix[rows][columns] == "*")){
                                    count++;
                                }
                            }
                            matrix[i][j] = "" + count;
                        }
                    }
                }
            }

            return matrix;
        }
    }



