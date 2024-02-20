package org.example.c01operators;
import java.math.BigInteger;
/************************************************
 Write a java program to display multiple variables.
 Sample Variables :
 a+ c, x + c,dx + x, ((int) dx) + ax, a + x, s + b, ax + b, s + c, ax + c, ax + ux , c
 Declaration :
 ************************************************/
public class DisplayMultipleVariables {
    private DisplayMultipleVariables() {}

    public static String displayMultipleVariable(int a, int b, long ax, short s, float x, double dx, char c) {

        BigInteger ux = new BigInteger("2541567890");
        return "a+c= " + a+c + "\n"
                +"x+c= " + x+c+ "\n"
                +"dx+x= " + dx+x+ "\n"
                +"dx+ax = " + (int)dx+ax+ "\n"
                +"a+x = " + a+x+ "\n"
                +"s+b =" + s+b+ "\n"
                +"ax+b = " + ax+b+ "\n"
                +"s+c = " + s+c+ "\n"
                +"ax+c = " + ax+c+ "\n"
                +"ax+ux = " + ax+ux+ "\n"
                +"c = " + c;
    }
}
