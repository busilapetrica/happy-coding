package org.example.c01operators;

import org.example.c01operators.CalculateEmployedSalary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateEmployedSalaryTest {
    @Test
    void returnIdAndSalaryBasedOnHourWorkedAndHourPayment() {
        String result = CalculateEmployedSalary.employedSalaryCalculation(5, 6, "0345");
        assertEquals("0345, 30.0", result);
    }

}