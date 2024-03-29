package org.example.c02controlFlow.generate;

/**************************************
 Write a java program to display  a pattern like diamond.
      *
     ***
    *****
   *******
    *****
     ***
      *
 *************************************/
public class PrintDiamondUsingAsterisk {
    private PrintDiamondUsingAsterisk() {}

    public static String diamondDisplay(int rows) {
        String result = "";
        //first part
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                result += " ";
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                result += "*";
            }
            result += "\n";
        }

        // second part
        for (int i = rows; i >= 1; i--) {
            for (int j = rows - i; j >= 1; j--) {
                result += " ";
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }
}
