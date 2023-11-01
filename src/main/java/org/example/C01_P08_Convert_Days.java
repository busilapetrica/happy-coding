package org.example;

public class C01_P08_Convert_Days {
    public static void main(String[] args){
        /*Write a C program to convert specified days into years, weeks and days.
Note: Ignore leap year.

Test Data :
Number of days : 1329
Expected Output :
Years: 3
Weeks: 33
Days: 3 */

        int days = 1329;
        int years_total = days  / 365;
        int weeks_total = (days % 365) / 7;
        int days_total = days - (years_total * 365  + weeks_total * 7);
        System.out.println(years_total);
        System.out.println(weeks_total);
        System.out.println(days_total);
    }
}
