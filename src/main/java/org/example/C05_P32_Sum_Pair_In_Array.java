package org.example;
/******************************************************************************
 32.Write a program in java to find a pair with given sum in the array.
 Expected Output :
 The given array : 6 8 4 -5 7 9
 The given sum : 15
 Pair of elements can make the given sum by the value of index 0 and 5
 *******************************************************************************/

public class C05_P32_Sum_Pair_In_Array {
    public static String findPairValueSum(int[] array, int givenSum) {
        String result ="";

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == givenSum){
                    result += i+" and "+ j;
                }
            }
            break;
        }
        return result;
    }
}

