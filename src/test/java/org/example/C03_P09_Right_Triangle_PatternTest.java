package org.example;

import org.example.c02controlFlow.validate.C03_P09_Right_Triangle_Pattern;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P09_Right_Triangle_PatternTest {
    @Test
    public void returnPatternTriangleOf4Rows() {
        String result = C03_P09_Right_Triangle_Pattern.trianglePattern(4);
        assertEquals("""
                *
                **
                ***
                ****
                """, result);
    }

}