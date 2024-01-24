package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class C01_P14_Bike_Average_ConsumptionTest {
    @Test
    public void returnBakeAverageConsumption() {
        float result = C01_P14_Bike_Average_Consumption.calculateAverageConsumption(350, 5);
        assertEquals(70.000 , result);
    }

}