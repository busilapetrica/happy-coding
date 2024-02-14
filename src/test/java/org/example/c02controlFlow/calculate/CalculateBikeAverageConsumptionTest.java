package org.example.c02controlFlow.calculate;
import org.example.c02controlFlow.calculate.CalculateBikeAverageConsumption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateBikeAverageConsumptionTest {
    @Test
    void returnBakeAverageConsumption() {
        float result = CalculateBikeAverageConsumption.calculateAverageConsumption(350, 5);
        assertEquals(70.000 , result);
    }

}