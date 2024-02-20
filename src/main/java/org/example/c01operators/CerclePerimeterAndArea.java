package org.example.c01operators;
/********************************************
 Write a java program to compute the perimeter
 and area of a circle with a given radius.
 *****************************************/
public class CerclePerimeterAndArea {
    private CerclePerimeterAndArea() {}

    public static double[] calculatePerimeterAndAreaOfCercle(double radius){
        double pi = 3.14;
        double cercle_perimeter = 2 * pi * radius;
        double cercle_area = pi * Math.pow(radius, 2);

        return new double[]{cercle_perimeter, cercle_area};
    }
}
