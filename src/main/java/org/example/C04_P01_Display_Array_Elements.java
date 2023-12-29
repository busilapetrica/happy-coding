package org.example;
/******************************************************************************
 Write a program in java to store elements in an array and print them.
 Test Data :
 Input 10 elements in the array :
 element - 0 : 1
 element - 1 : 1
 element - 2 : 2
 .......
 Expected Output :
 Elements in array are: 1 1 2 3 4 5 6 7 8 9
 *******************************************************************************/
public class C04_P01_Display_Array_Elements{
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 1;
        for(int i=1; i<=9; i++){
            arr[i] = i;
        }
        for(int i=0; i<=9; i++){
            System.out.print(arr[i] + " ");
        }
    }
}