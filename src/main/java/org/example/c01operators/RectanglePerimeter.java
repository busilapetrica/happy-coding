package org.example.c01operators;
/****************************************
 /*Write a java program to compute the perimeter and area of a rectangle with a height of 7 inches and width of 5 inches.
 Expected Output:
 Perimeter of the rectangle = 24 inches
 Area of the rectangle = 35 square inches
 ***************************************/
public class RectanglePerimeter {
    private RectanglePerimeter() {}

    public static int calculatePerimeterOfRectangle(int height, int width) {
        int perimeter = 2 * (height + width);
        return perimeter;
    }
}
