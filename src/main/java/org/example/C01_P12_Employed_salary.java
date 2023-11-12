package org.example;

public class C01_P12_Employed_salary {
    /*Write a java program that accepts an employee's ID, total worked hours in a month and the amount he received per hour.
    Print the ID and salary (with two decimal places) of the employee for a particular month.
Test Data :
Input the Employees ID(Max. 10 chars): 0342
Input the working hrs: 8
Salary amount/hr: 15000
Expected Output:
Employees ID = 0342
Salary = U$ 120000.00 */
    public static void main(String[] args){

        String id_imployed = "0342";
        int working_hours = 8 ;
        int amount_hour = 15000;
        double employees_salary = amount_hour*working_hours;

        System.out.println("Employees ID: " + id_imployed);
        System.out.printf("Salary: %.2f", employees_salary);

    }
}
