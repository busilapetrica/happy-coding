package org.example;
import java.math.BigInteger;
public class C01_P07_Display_Multiple_Variables {
    public static void main(String[] args){
        /*Write a C program to display multiple variables.
Sample Variables :
a+ c, x + c,dx + x, ((int) dx) + ax, a + x, s + b, ax + b, s + c, ax + c, ax + ux , c
Declaration :
 */
        BigInteger ux = new BigInteger("2541567890");
        int a = 125, b = 12345;
        long ax = 1234567890;
        short s = 4043;
        float x = 2.13459F;
        double dx = 1.1415927;
        char c = 'W';
        System.out.println("a+c= " + a+c);
        System.out.println("x+c= " + x+c);
        System.out.println("dx+x= " + dx+x);
        System.out.println("dx+ax = " + (int)dx+ax);
        System.out.println("a+x = " + a+x);
        System.out.println("s+b =" + s+b);
        System.out.println("ax+b = " + ax+b);
        System.out.println("s+c = " + s+c);
        System.out.println("ax+c = " + ax+c);
        System.out.println("ax+ux = " + ax+ux);
        System.out.println((int) c);
    }
}
