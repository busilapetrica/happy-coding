package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C03_P14_Pyramid_PatternTest {
    @Test
    public void returnPatternPyramidWithAsterixIncreasingWith4Rows() {
        String result = C03_P14_Pyramid_Pattern.pyramidPattern(4);
        assertEquals("""
                                 *
                                * *
                               * * *
                              * * * *
                                """, result);
    }

}