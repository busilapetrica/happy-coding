package org.example;

public class C01_P06_Cercle_Perimeter_Area {
    public static void main(String[] args){

        /* Write a C program to compute the perimeter and area of a circle with a given radius.
Expected Output:
Perimeter of the Circle = 37.680000 inches
Area of the Circle = 113.040001 square inches*/

         double pi = 3.14;
         double radius = 12.0;
         double cercle_perimeter = 2 * pi * radius;
         double cercle_area = pi * Math.pow(radius, 2);

         System.out.println(cercle_perimeter);
         System.out.println(cercle_area);
    }
}
