package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P010_Right_Number_Triangle_PatternTest {
    @Test
    public void returnPatternTriangleNumbersWith4Rows() {
        String result = C03_P010_Right_Number_Triangle_Pattern.patternTriangleNumbers(4);
        assertEquals("""
                                1
                                12
                                123
                                1234
                                """, result);
    }
}