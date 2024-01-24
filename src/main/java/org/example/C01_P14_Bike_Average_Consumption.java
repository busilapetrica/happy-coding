package org.example;
/*********************************************
Write a java program to calculate a bike’s average consumption from the given total distance (integer value)
travelled (in km) and spent fuel (in litters, float number – 2 decimal points).
Test Data :
Input total distance in km: 350
Input total fuel spent in liters: 5
Expected Output:
Average consumption (km/lt) 70.000
 ************************************************/
public class C01_P14_Bike_Average_Consumption {
    static float calculateAverageConsumption(int distance, int fuel_spend_liters) {
        float avarege_consuption;
        avarege_consuption = distance / fuel_spend_liters;
        return avarege_consuption;
    }
}
