package org.example;

public class C01_P14_Bike_Average_Consumption {
    public static void main(String[] args){
        /*Write a java program to calculate a bike’s average consumption from the given total distance (integer value)
        travelled (in km) and spent fuel (in litters, float number – 2 decimal points).
Test Data :
Input total distance in km: 350
Input total fuel spent in liters: 5
Expected Output:
Average consumption (km/lt) 70.000 */
        int distance = 350;
        int fuel_spend_liters = 5;
        float avarege_consuption = distance/fuel_spend_liters ;

        System.out.printf("Average consumption (km/lt) = %.4f", avarege_consuption);
    }
}
