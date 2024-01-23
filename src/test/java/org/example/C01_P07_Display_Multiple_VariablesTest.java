package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C01_P07_Display_Multiple_VariablesTest {
@Test
    public void displayMultipleVariable() {
        int a = 125, b = 12345;
        long ax = 1234567890;
        short s = 4043;
        float x = 2.13459F;
        double dx = 1.1415927;
        char c = 'W';
String result = C01_P07_Display_Multiple_Variables.displayMultipleVariable(a, b, ax, s, x, dx, c);

    assertEquals("""
            a+c= 125W
            x+c= 2.13459W
            dx+x= 1.14159272.13459
            dx+ax = 11234567890
            a+x = 1252.13459
            s+b =404312345
            ax+b = 123456789012345
            s+c = 4043W
            ax+c = 1234567890W
            ax+ux = 12345678902541567890
            c = W""", result);
    }
}