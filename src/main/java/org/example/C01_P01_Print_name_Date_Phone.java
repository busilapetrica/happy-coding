package org.example;

/********************************************
 /*Write a C program to print your name, date of birth, and mobile number.
 Expected Output:
 Name   : Petrica
 DOB    : July 14, 1975
 Mobile : 99-9999999999
 *******************************************/
public class C01_P01_Print_name_Date_Phone {
    private C01_P01_Print_name_Date_Phone () {}

    public static String printDates(String name, String dateBirth, String phonenumber){
        return name + ", " + dateBirth + ", " + phonenumber;
    }

}
