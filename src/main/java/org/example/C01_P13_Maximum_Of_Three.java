package org.example;

public class C01_P13_Maximum_Of_Three {
    public static void main(String[] args){
        /* Write a java program that accepts three integers and finds the maximum of three.
Test Data :
Input the first integer: 25
Input the second integer: 35
Input the third integer: 15
Expected Output:
Maximum value of three integers: 35*/
        int first_int = 25;
        int second_int = 35;
        int third_int = 15;
        if(first_int > second_int && first_int > third_int){
            System.out.println("the first integer " + first_int + " is biggerst number");
        }else if(second_int > first_int && second_int > third_int){
            System.out.println("the second integer " + second_int + " is biggest number");
        }else{
            System.out.println("the third integer " + third_int + " is biggest number");
        }
    }
}
