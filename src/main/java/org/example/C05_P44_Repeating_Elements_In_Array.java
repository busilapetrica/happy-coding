package org.example;
import java.util.Arrays;
/******************************************************************************
 44.Write a program in java to find the two repeating elements in a given array.
 Expected Output :
 The given array is : 2 7 4 7 8 3 4
 The repeating elements are: 7 0
 *******************************************************************************/
public class C05_P44_Repeating_Elements_In_Array {
    private C05_P44_Repeating_Elements_In_Array () {}
    public static String findAndPrintRepeatingElements(int[] array) {
        Arrays.sort(array);

        boolean foundFirst = false;
        String result = "";

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                if (!foundFirst || array[i] != array[i - 1]) {
                    result +=array[i] + " ";
                    foundFirst = true;
                }
            }
        }
        return result;
    }
}
