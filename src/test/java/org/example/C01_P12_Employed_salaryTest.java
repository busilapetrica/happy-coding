package org.example;
import org.example.c02controlFlow.calculate.CalculateEmployedSalary;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P12_Employed_salaryTest {
    @Test
    public void returnIdAndSalaryBasedOnHourWorkedAndHourPayment() {
        String result = CalculateEmployedSalary.employedSalaryCalculation(5,6,"0345");
        assertEquals("0345, 30.0", result);
    }

}