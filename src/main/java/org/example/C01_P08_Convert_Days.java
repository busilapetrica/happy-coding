package org.example;
/**************************************
 /*Write a C program to convert specified days into years, weeks and days.
 Note: Ignore leap year.
 Test Data :
 Number of days : 1329
 Expected Output :
 Years: 3
 Weeks: 33
 Days: 3
 *************************************/
public class C01_P08_Convert_Days {
    private C01_P08_Convert_Days () {}

    static String convertDays(int days) {

        int years_total = days  / 365;
        int weeks_total = (days % 365) / 7;
        int days_total = days - (years_total * 365  + weeks_total * 7);
        String result = years_total + ", " + weeks_total + ", " + days_total ;

      return result;
    }
}
