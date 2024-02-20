package org.example.c01operators;

/********************************************
 /*Write a C program to print your name, date of birth, and mobile number.
 Expected Output:
 Name   : Petrica
 DOB    : July 14, 1975,
 Mobile : 99-9999999999
 *******************************************/
public class PrintNameDateAndPhoneNumber {
    private PrintNameDateAndPhoneNumber() {}

    public static String printDates(String name, String dateBirth, String phoneNumber){
        return name + ", " + dateBirth + ", " + phoneNumber;
    }

}
