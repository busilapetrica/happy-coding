package org.example.c03arrays.search;
/***************************************
 17. Write a program in java to find the second-smallest element in an array.
 Test Data :
 Input the size of array : 5
 Input 5 elements in the array (value must be <9999) :
 element - 0 : 0
 element - 1 : 9
 element - 2 : 4
 element - 3 : 6
 element - 4 : 5
 Expected Output :
 The Second-smallest element in the array is : 4
 ********************************************/
public class FindSecondSmallestNumberInArray {
    private FindSecondSmallestNumberInArray() {}

    public static int findSecondSmallestElement(int[] array) {

        if( array.length == 2){
            if(array[0] > array[1]){
                return array[1];
            }else{
                return array[0];
            }
        }else{
            for (int i = 0; i < array.length-1; i++) {
                for (int j = 0; j < array.length - i-1; j++) {
                    if (array[j] > array[j + 1]) {

                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return array[1];
        }
    }
}
