package org.example;
import org.example.c01operators.EmployedSalary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P12_Employed_salaryTest {
    @Test
    public void returnIdAndSalaryBasedOnHourWorkedAndHourPayment() {
        String result = EmployedSalary.employedSalaryCalculation(5,6,"0345");
        assertEquals("0345, 30.0", result);
    }

}