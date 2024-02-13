package org.example;
import org.example.c02controlFlow.calculate.CalculateBikeAverageConsumption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Calculate_Bike_Average_ConsumptionTest {
    @Test
    void returnBakeAverageConsumption() {
        float result = CalculateBikeAverageConsumption.calculateAverageConsumption(350, 5);
        assertEquals(70.000 , result);
    }

}