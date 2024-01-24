package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P12_Employed_salaryTest {
    @Test
    public void returnIdAndSalaryBasedOnHourWorkedAndHourPayment() {
        String result = C01_P12_Employed_salary.employedSalaryCalculation(5,6,"0345");
        assertEquals("0345, 30.0", result);
    }

}