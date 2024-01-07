package org.example;

import java.util.Scanner;

/******************************************************************************
 Write a program in java to count the total number of duplicate elements in an array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 5
 element - 1 : 1
 element - 2 : 1
 Expected Output :
 Total number of duplicate elements found in the array is : 1
 *******************************************************************************/
public class C04_P05_Dublicates_In_Array {
    public static void main(String[] args) {
        System.out.println("number of elements : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Element - " + i + " - :");
            array[i] = in.nextInt();
        }
        int countDublicates = findDublicateInArray(array);
        System.out.print("Total number of dublicate elements found in the array: " + countDublicates);
    }

    public static int findDublicateInArray(int[] array) {
        int count = 0;
         // Use a boolean array to keep track of which elements are already counted
        boolean[] counted = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (!counted[i]) {
                //Using int j = i + 1 in the second for loop prevents self-comparison and avoids counting duplicates.
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
            }
        }
        return count;
    }
}
