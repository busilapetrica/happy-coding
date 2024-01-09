package org.example;

import java.util.Scanner;

/******************************************************
 Write a program in java to count the frequency of each element of an array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 25
 element - 1 : 12
 element - 2 : 43
 Expected Output :
 The frequency of all elements of an array :
 25 occurs 1 times
 12 occurs 1 times
 43 occurs 1 times
 *******************************************************/
public class C05_P08_Frequency_Elements_Of_Array {
    public static void main(String[] args) {
        System.out.println("Number elements:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Element - " + i + " - :");
            array[i] = scanner.nextInt();
        }
        String result = findFrequencyElements(array);
        System.out.println(result);
    }

    public static String findFrequencyElements(int[] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (!result.contains(array[i] + " occurs " + count + " times")) {
                result += array[i] + " occurs " + count + " times\n";
            }
        }
        return result;
    }
}
