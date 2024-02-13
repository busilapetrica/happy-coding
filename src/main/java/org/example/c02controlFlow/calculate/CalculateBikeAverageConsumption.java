package org.example.c02controlFlow.calculate;
/*********************************************
Write a java program to calculate a bike’s average consumption from the given total distance (integer value)
travelled (in km) and spent fuel (in litters, float number – 2 decimal points).
Test Data :
Input total distance in km: 350
Input total fuel spent in liters: 5
Expected Output:
Average consumption (km/lt) 70.000
 ************************************************/
public class CalculateBikeAverageConsumption {
    private CalculateBikeAverageConsumption() {}

    public static float calculateAverageConsumption(int distance, int fuelSpendLiters) {
        float averageConsumption;
        averageConsumption = (float) distance / fuelSpendLiters;
        return averageConsumption;
    }
}
