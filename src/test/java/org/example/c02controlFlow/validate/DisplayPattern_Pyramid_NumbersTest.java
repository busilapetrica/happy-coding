package org.example.c02controlFlow.validate;

import org.example.c02controlFlow.validate.DisplayPatternPyramidNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayPattern_Pyramid_NumbersTest {
    @Test
    public void returnPatternPyramidWithSameNumberOnRows() {
        String result = DisplayPatternPyramidNumbers.pyramidNumbers(4);
        assertEquals("""
                                 1
                                2 2
                               3 3 3
                              4 4 4 4
                            """, result);
    }

}