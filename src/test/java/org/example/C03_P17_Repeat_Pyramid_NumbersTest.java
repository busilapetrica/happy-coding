package org.example;

import org.example.c02controlFlow.validate.C03_P17_Repeat_Pyramid_Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P17_Repeat_Pyramid_NumbersTest {
    @Test
    public void returnPatternPyramidWithSameNumberOnRows() {
        String result = C03_P17_Repeat_Pyramid_Numbers.pyramidNumbers(4);
        assertEquals("""
                                 1
                                2 2
                               3 3 3
                              4 4 4 4
                            """, result);
    }

}