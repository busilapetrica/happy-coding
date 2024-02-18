package org.example.c01operators;
import org.example.c01operators.CalculateBikeAverageConsumption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateBikeAverageConsumptionTest {
    @Test
    void returnBakeAverageConsumption() {
        float result = CalculateBikeAverageConsumption.calculateAverageConsumption(350, 5);
        assertEquals(70.000 , result);
    }

}