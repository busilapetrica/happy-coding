package org.example;

import java.util.Scanner;

/******************************************************************************
 Write a program in java to copy the elements of one array into another array.
 Test Data :
 Input the number of elements to be stored in the array :3
 Input 3 elements in the array :
 element - 0 : 15
 element - 1 : 10
 element - 2 : 12
 Expected Output :
 The elements stored in the first array are :
 15 10 12
 The elements copied into the second array are :
 15 10 12
 *******************************************************************************/
public class C04_P04_Array_Copy {
    public static void main(String[] args) {
        System.out.println("Numbers of elements :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Element - " + i + " - :");
            array[i] = scanner.nextInt();
        }

        StringBuilder result = copyToSecondArray(array);
        System.out.println(result);
    }
    public static StringBuilder copyToSecondArray(int[] array) {
        //copy array to a new array
        int[] arrayCopy = new int[array.length];
        for(int i=0; i<array.length; i++){
            arrayCopy[i] = array[i];
        }
            //build a string with elements from new array and returned to print it in main function
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrayCopy.length; i++) {
            result.append(arrayCopy[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        return result;
    }
}

