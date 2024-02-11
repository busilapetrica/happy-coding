package org.example.c01operators;
/*******************************************
Write a java program that accepts an employee's ID, total worked hours in a month and the amount he received per hour.
   Print the ID and salary (with two decimal places) of the employee for a particular month.
Test Data :
Input the Employees ID(Max. 10 chars): 0342
Input the working hrs: 8
Salary amount/hr: 15000
Expected Output:
Employees ID = 0342
Salary = U$ 120000.00
 ********************************************/
public class EmployedSalary {
    private EmployedSalary() {}

    public static String employedSalaryCalculation(int amount_hour, int working_hours, String id_imployed) {
       String result ="";
        double employees_salary = amount_hour * working_hours;
        result = id_imployed + ", " + employees_salary;
      return result;
    }
}
